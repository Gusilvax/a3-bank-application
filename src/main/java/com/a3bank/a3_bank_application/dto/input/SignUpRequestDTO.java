package com.a3bank.a3_bank_application.dto.input;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public record SignUpRequestDTO(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank @CPF String cpf,
        @NotBlank @Size(min = 6) String password
) {}
