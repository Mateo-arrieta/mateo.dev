package com.mateodev.demo.dto.request;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Getter
@Setter

public class RegisterRequest {
    @NotBlank(message= "En nombre no puede estar vacio")
    private String firstName;

    @NotBlank(message= "En apellido no puede estar vacio")
    private String lastName;

    @Email(message= "Debe proporcionar un correo valido")
    @NotBlank(message= "En email no puede estar vacio")
    private String email;

    @Size(min=6, message= "La contraseña debe tener minimo 6 caracteres")
    @NotBlank(message= "El password no puede estar vacio")
    private String password;
    
}
