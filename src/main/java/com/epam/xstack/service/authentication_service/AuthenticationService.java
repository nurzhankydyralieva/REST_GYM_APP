package com.epam.xstack.service.authentication_service;

import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationResponseDTO;

import java.util.UUID;


public interface AuthenticationService {

    AuthenticationResponseDTO authenticateLogin(UUID id, AuthenticationRequestDTO requestDTO);
    AuthenticationResponseDTO authenticationChangeLogin(UUID id, AuthenticationChangeLoginRequestDTO requestDTO);

}
