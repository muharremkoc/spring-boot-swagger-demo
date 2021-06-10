package com.springbootswaggerexample.payload.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDeleteResponse {
    @NonNull
    private String message;
}
