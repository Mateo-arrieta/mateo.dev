package com.mateodev.demo.service.impl;

import java.util.List;

import com.mateodev.demo.dto.request.TransferRequest;
import com.mateodev.demo.dto.response.TransactionResponse;

public interface TransactionService {

    TransactionResponse transfer(TransferRequest request, String username);

    List<TransactionResponse> getAccountHistory(String accountNumber, String username);
}