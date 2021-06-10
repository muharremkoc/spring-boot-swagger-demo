package com.springbootswaggerexample.repository;

import com.springbootswaggerexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{

}
