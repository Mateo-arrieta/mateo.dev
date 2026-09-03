package com.mateodev.demo.dto.request;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;


@Getter
@Setter

public class LoginRequest {

    @Email(message= "Debe proporcionar un email valido")
    @NotBlank(message= "El email no puede estar vacio")
    private String email;

    @NotBlank(message= "La contraseña no puede estar vacia")
    private String password;

}
