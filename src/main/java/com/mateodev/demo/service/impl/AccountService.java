package com.mateodev.demo.service.impl;

import java.util.List;

import com.mateodev.demo.dto.response.AccountResponse;

public interface AccountService {
    List<AccountResponse> getUserAccounts(String email);
    AccountResponse getAccountByNumber(String accountNumber, String email);
}
