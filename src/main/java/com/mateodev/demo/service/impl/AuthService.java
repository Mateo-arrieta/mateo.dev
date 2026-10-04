package com.mateodev.demo.service.impl;

import com.mateodev.demo.dto.request.LoginRequest;
import com.mateodev.demo.dto.request.RegisterRequest;
import com.mateodev.demo.dto.response.AuthResponse;

public interface AuthService {

    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
    
}
