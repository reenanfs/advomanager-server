package com.advomanager.user.dto;

import jakarta.validation.constraints.Email;

public class UpdateUserDTO {

    private String name;

    @Email(message = "Email should be valid")
    private String email;

    private Boolean isActive;

    private String photoUrl;

    public UpdateUserDTO() {}

    public UpdateUserDTO(String name, String email, Boolean isActive, String photoUrl) {
        this.name = name;
        this.email = email;
        this.isActive = isActive;
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
