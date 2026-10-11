package com.a3bank.a3_bank_application.dto.input;

import jakarta.validation.constraints.Password;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequestDTO(

        @NotBlank @Email String email,
        @NotBlank@Password String password
) {
}
