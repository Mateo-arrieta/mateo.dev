package com.mateodev.demo.dto.request;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.DecimalMin;

@Getter
@Setter

public class TransferRequest {

    @NotBlank(message = "La cuenta origen no puede ir vacia")
private String sourceAccountNumber;

@NotBlank(message = "La cuenta destino no puede ir vacia")
private String destinationAccountNumber;

@NotNull(message = "El monto es obligatorio")
@DecimalMin(value = "0.01", message = "El monto debe ser mayor a cero")
private BigDecimal amount;

private String description;

}
