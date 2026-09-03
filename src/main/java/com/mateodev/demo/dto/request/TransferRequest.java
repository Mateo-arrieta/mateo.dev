package com.mateodev.demo.dto.request;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.DecimalMin;

@Getter
@Setter

public class TransferRequest {

    @NotBlank(message= "La cuenta origen no puede ir vacia")
    private String sourceAccountNumber;

    @NotBlank(message= "La cuenta destino no puede ir vacia")
    private String destinatiAccountNumber;

    @DecimalMin(value= "0.01", message= "El monto debe ser mayor a cero")
    @NotBlank(message= "El monto es obligatorio")
    private BigDecimal Account;


    private String description;

}
