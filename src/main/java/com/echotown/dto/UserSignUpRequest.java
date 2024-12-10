package com.echotown.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserSignUpRequest(
        @JsonProperty("username")
        String username,
        @JsonProperty("email")
        String email,
        @JsonProperty("password")
        String password
) {
}
