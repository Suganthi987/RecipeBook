package com.example.recipeBook.Model.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.misc.NotNull;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min =3, max = 20, message = "Username should contain a minimum of 3 characters")
    private String username;

    @NotNull
    @NotBlank
    @Size(min=6, max=30, message = "Password should contain a mininmum of 6 characters")
    private String password;

    public LoginFormDTO() {
    }

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
