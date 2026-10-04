package com.mateodev.demo.controller;

import java.util.List;

   import org.springframework.security.core.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateodev.demo.dto.response.AccountResponse;
import com.mateodev.demo.service.impl.AccountService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
@RequestMapping("/api/v1/accounts") 
@RequiredArgsConstructor 
public class AccountController {

        private final AccountService accountService;

       @GetMapping
public ResponseEntity<List<AccountResponse>> getMyAccounts(Authentication authentication){
    return ResponseEntity.ok(accountService.getUserAccounts(authentication.getName()));
}

@GetMapping("/{accountnumber}")
public ResponseEntity<AccountResponse> getAccountByNumber(@PathVariable String accountnumber, Authentication authentication){
    return ResponseEntity.ok(accountService.getAccountByNumber(accountnumber, authentication.getName()));
}

}
