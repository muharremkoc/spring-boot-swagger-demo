package com.springbootswaggerexample.service;

import com.springbootswaggerexample.exception.UserAlreadyExistsException;
import com.springbootswaggerexample.exception.UserNotFoundException;
import com.springbootswaggerexample.model.User;
import com.springbootswaggerexample.payload.request.UserCreateRequest;
import com.springbootswaggerexample.payload.request.UserUpdateRequest;
import com.springbootswaggerexample.payload.response.UserDeleteResponse;
import com.springbootswaggerexample.repository.UserRepository;
import lombok.NonNull;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
      @Autowired
    ModelMapper modelMapper;

    @Override
    /*
      public ResponseEntity<List<User>> getAllUsers(String firstName) {
        try {
            List<User> users = new ArrayList<User>();

            if (firstName == null)
                userRepository.findAll().forEach(users::add);

            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            Thread.sleep(5000L);//5 milisanaye bekle
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
     */
    public List<User> getUsers() {
        Iterable<User> result = userRepository.findAll();
        List<User> employeesList = new ArrayList<User>();
        result.forEach(employeesList::add);
        return employeesList;
    }

    @Override
    public User createUser(UserCreateRequest userCreateRequest) {

        Optional<User> optionalUser=userRepository.findById(userCreateRequest.getId());

        if (optionalUser.isPresent()) {
            throw new UserAlreadyExistsException();
        }


        User user=modelMapper.map(userCreateRequest,User.class);

        return userRepository.save(user);

    }

    @Override
    public User  updateUser(Long id, UserUpdateRequest userUpdateRequest) {
        /*
        Optional<User> userData = userRepository.findById(id);

        if (userData.isPresent()) {
            User currentUser = userData.get();
            currentUser.setId(user.getId());
            currentUser.setFirstName(user.getFirstName());
            currentUser.setLastName(user.getLastName());
            return new ResponseEntity<>(userRepository.save(currentUser), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

         */
            User newUser=userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
            newUser.setFirstName(userUpdateRequest.getFirstName());
            newUser.setLastName(userUpdateRequest.getLastName());


            return userRepository.save(newUser);

        }



    @Override
    public UserDeleteResponse deleteUser(Long id) {

        User user=userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());
        userRepository.delete(user);

        return new UserDeleteResponse(id+" User deleted");
    }



}

