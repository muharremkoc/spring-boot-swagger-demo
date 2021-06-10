package com.springbootswaggerexample.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class User {
    @Id
   @Column(name = "id")
    Long id;

    @Column(name = "firstName")
    String firstName;

    @Column(name = "lastName")
    String lastName;
    public User() {

    }
    @Override
    public String toString() {
        return "User [id=" + id + ", firstNmae=" + firstName + ", lastName=" + lastName + "]";
    }

}
