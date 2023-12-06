package com.epam.xstack.controller;

import com.epam.xstack.model.dto.authentication.AuthenticationChangeLoginRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationRequestDTO;
import com.epam.xstack.model.dto.authentication.AuthenticationResponseDTO;
import com.epam.xstack.service.authentication_service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @GetMapping("/{id}")
    public ResponseEntity<AuthenticationResponseDTO> login(@PathVariable("id") UUID id, @RequestBody AuthenticationRequestDTO requestDTO) {
        return new ResponseEntity<>(authenticationService.authenticateLogin(id, requestDTO), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AuthenticationResponseDTO> updateUser(@PathVariable("id") UUID id, @RequestBody AuthenticationChangeLoginRequestDTO requestDTO) {
        return new ResponseEntity<>(authenticationService.authenticationChangeLogin(id, requestDTO), HttpStatus.OK);
    }
}
