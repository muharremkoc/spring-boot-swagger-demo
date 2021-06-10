package com.springbootswaggerexample.controller;

import com.springbootswaggerexample.CacheRedisController;
import com.springbootswaggerexample.CacheRedisService;
import com.springbootswaggerexample.model.User;
import com.springbootswaggerexample.payload.request.UserCreateRequest;
import com.springbootswaggerexample.payload.request.UserUpdateRequest;
import com.springbootswaggerexample.payload.response.UserDeleteResponse;
import com.springbootswaggerexample.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;


@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor

public class UserController {

    public static final org.apache.log4j.Logger logger = Logger.getLogger(UserController.class);



    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping(value = "/users")
    @Operation(summary = "Create New User")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User inserted",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "User NotFound",
                    content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@Valid @RequestBody UserCreateRequest userCreateRequest) {
        logger.info("User Created");
        return userService.createUser(userCreateRequest);
    }

    @PutMapping("/users/{id}")
    @Operation(summary = "Update user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "A user has been updated",
                    content = {@Content(mediaType = "application/json")})
    })
    @ResponseStatus(HttpStatus.OK)
    public User updateUser(@NotBlank @PathVariable("id") Long id, @Valid @RequestBody UserUpdateRequest userUpdateRequest) {
        logger.info("User Update Success");
        return userService.updateUser(id, userUpdateRequest);
    }


    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        logger.info(id + ".User Deleted");
        userService.deleteUser(id);
    }


}
