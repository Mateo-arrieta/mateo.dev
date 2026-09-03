package com.mateodev.demo.dto.response;

import java.math.BigDecimal;

import com.mateodev.demo.entity.enums.AccountType;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class AccountResponse {

    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private AccountType accountType;

}
