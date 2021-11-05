package com.example.healthy_way.model.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginBindingModel {

    private String email;

    private String password;

    public LoginBindingModel() {
    }

    @Email
    @NotBlank
    public String getEmail() {
        return email;
    }


    public LoginBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    @NotNull
    @NotBlank
    @Size(min = 3, max = 12)
    public String getPassword() {
        return password;
    }

    public LoginBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }
}
