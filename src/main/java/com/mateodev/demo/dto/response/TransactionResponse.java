package com.mateodev.demo.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.mateodev.demo.entity.enums.TransactionType;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class TransactionResponse {

    private Long id;
    private String accountNumber;
    private String sourceAccountNumber;
    private String destinationAccount;
    private BigDecimal amount;
    private TransactionType transactionType;
    private String descripcion;
    private LocalDateTime timestamp;

}
