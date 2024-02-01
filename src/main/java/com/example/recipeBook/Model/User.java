package com.example.recipeBook.Model;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class User extends AbstractEntity{
    @NotNull
    String user_name;
    @NotNull
    String pwdHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User() {
    }

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.pwdHash = encoder.encode(password);
    }

    public String getUser_name() {
        return user_name;
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwdHash);
    }

}
