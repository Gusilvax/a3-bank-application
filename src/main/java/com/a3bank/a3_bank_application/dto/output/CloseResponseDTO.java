package com.a3bank.a3_bank_application.dto.output;

public record CloseResponseDTO(
        String nome,
        String cpf,
        String agencia,
        String conta
) {
}
