package com.epam.xstack.dao.authenticationDAO;

import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationResponseDTO;

public interface AuthenticationDAO {
    AuthenticationResponseDTO authenticateLogin(Long id, AuthenticationRequestDTO requestDTO);

    AuthenticationResponseDTO authenticationChangeLogin(Long id, AuthenticationChangeLoginRequestDTO requestDTO);
}
