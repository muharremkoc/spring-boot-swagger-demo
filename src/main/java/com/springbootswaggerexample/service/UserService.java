package com.springbootswaggerexample.service;

import com.springbootswaggerexample.model.User;
import com.springbootswaggerexample.payload.request.UserCreateRequest;
import com.springbootswaggerexample.payload.request.UserUpdateRequest;
import com.springbootswaggerexample.payload.response.UserDeleteResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
<<<<<<< HEAD
    //ResponseEntity<List<User>> getAllUsers(String firstName);
    User createUser(UserCreateRequest userCreateRequest);
    User updateUser(Long id, UserUpdateRequest userUpdateRequest);
   UserDeleteResponse deleteUser(Long id);
    List<User> getUsers();

=======
    ResponseEntity<List<User>> getAllUsers(String firstName);
    User createUser(UserCreateRequest userCreateRequest);
    User updateUser(Long id, UserUpdateRequest userUpdateRequest);
   UserDeleteResponse deleteUser(Long id);
>>>>>>> 0a0cfee765bcdbd701e5d4b1228df0d1e0dc4ad5
}
