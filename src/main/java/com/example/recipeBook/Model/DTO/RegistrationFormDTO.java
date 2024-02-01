package com.example.recipeBook.Model.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegistrationFormDTO extends LoginFormDTO{

    @NotNull
    @NotBlank
    @Size(min=6, max=30, message="Password should contain a minimum of 6 characters")
    private String verifyPassword;

    public RegistrationFormDTO() {
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
