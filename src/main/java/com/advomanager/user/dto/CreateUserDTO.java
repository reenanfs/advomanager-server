package com.advomanager.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateUserDTO {
	@NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    private String email;

    private String photoUrl;

    public CreateUserDTO() {}

    public CreateUserDTO(String name, String email, String photoUrl) {
        this.name = name;
        this.email = email;
        this.photoUrl = photoUrl;
    }

    public String getName() { return name; }
    
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    
    public void setEmail(String email) { this.email = email; }

    public String getPhotoUrl() { return photoUrl; }
    
    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }
}
