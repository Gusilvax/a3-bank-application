package com.a3bank.a3_bank_application.dto.output;

public record DeleteResponseDTO(
        Long id,
        String name,
        String username,
        String password
) {
}
