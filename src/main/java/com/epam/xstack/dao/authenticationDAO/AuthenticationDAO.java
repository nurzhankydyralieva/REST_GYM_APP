package com.epam.xstack.dao.authenticationDAO;

import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationResponseDTO;

import java.util.UUID;

public interface AuthenticationDAO {
    AuthenticationResponseDTO authenticateLogin(UUID id, AuthenticationRequestDTO requestDTO);

   AuthenticationResponseDTO authenticationChangeLogin(UUID id, AuthenticationChangeLoginRequestDTO requestDTO);

}
