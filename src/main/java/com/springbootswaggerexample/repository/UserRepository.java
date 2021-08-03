package com.springbootswaggerexample.repository;

import com.springbootswaggerexample.model.User;
<<<<<<< HEAD
import com.springbootswaggerexample.payload.request.UserCreateRequest;
import com.springbootswaggerexample.payload.request.UserUpdateRequest;
import com.springbootswaggerexample.payload.response.UserDeleteResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

=======
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
>>>>>>> 0a0cfee765bcdbd701e5d4b1228df0d1e0dc4ad5

public interface UserRepository extends JpaRepository<User,Long>{

}
