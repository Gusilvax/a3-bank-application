package com.a3bank.a3_bank_application.dto.input;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public record CloseRequestDTO(
        @NotBlank String name,
        @NotBlank @CPF String cpf,
        @NotBlank @Size(min = 6) String password,
        @NotBlank @Email String email // Email seria apenas para informar que a conta foi encerrada, mas pode ser ativada a qualquer momento
) {
}
