package com.app.trlapp.dto;

import lombok.Data;

@Data
public class AuthRequestDto {
	  // Fields
    private String username;
    private String password;

    // Constructors
    public AuthRequestDto() {
    }

    public AuthRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
