package com.implants.demo.dto;

public class JwtResponse {

    private String message;
    private String redirectUrl;
    private String accessToken;
    private String role;



    public JwtResponse(String message, String redirectUrl, String accessToken, String role) {
        this.message = message;
        this.redirectUrl = redirectUrl;
        this.accessToken = accessToken;
        this.role = role;

    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
