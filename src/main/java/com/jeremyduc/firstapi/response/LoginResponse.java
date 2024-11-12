package com.jeremyduc.firstapi.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginResponse {
    private String token;

    private long expiresIn;
}
