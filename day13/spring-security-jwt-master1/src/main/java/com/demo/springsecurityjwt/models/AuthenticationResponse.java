package com.demo.springsecurityjwt.models;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

      //get 
    public String getJwt() {
        return jwt;
    }
}
