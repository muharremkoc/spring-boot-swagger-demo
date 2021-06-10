package com.springbootswaggerexample.repository;

import com.springbootswaggerexample.model.User;
import com.springbootswaggerexample.payload.request.UserCreateRequest;
import com.springbootswaggerexample.payload.request.UserUpdateRequest;
import com.springbootswaggerexample.payload.response.UserDeleteResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long>{

}
