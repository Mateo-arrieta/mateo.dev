package com.mateodev.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mateodev.demo.dto.response.AccountResponse;
import com.mateodev.demo.entity.User;
import com.mateodev.demo.entity.Account;
import java.util.stream.Collectors;
import com.mateodev.demo.execption.ResourceNotFoundException;
import com.mateodev.demo.repository.AccountRepository;
import com.mateodev.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;
    private final UserRepository userRepository;

    @Override  //esto es para llamar clases abstractas o interfaces
    public List<AccountResponse> getUserAccounts(String email){
        User user = userRepository.findByEmail(email).orElseThrow(()-> new ResourceNotFoundException("Usuario no encontardo con el email: "+email));

        return accountRepository.findByUserId(user.getId())
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public AccountResponse getAccountByNumber(String accountNumber, String email){
        Account account = accountRepository.findByAccountNumber(accountNumber)
        .orElseThrow(() -> new ResourceNotFoundException("Cuenta no encontrada: " + accountNumber));

        if (!account.getUser().getEmail().equals(email)){
            throw new ResourceNotFoundException("No tiene permisos para esta cuenta");
        }

        return mapToResponse(account);
        
        }

        private AccountResponse mapToResponse(Account account){
            return AccountResponse.builder()
                    .id(account.getId())
                    .accountNumber(account.getAccountNumber())
                    .balance(account.getBalance())
                    .accountType(account.getAccountType())
                    .build();
        }

}
