package com.springbootswaggerexample.payload.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    @NotBlank
    @Size(max = 50)
    String firstName;

    @NotBlank
    @Size(max = 50)
    String lastName;
}
