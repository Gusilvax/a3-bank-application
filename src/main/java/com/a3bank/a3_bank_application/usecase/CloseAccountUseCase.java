package com.a3bank.a3_bank_application.usecase;


import com.a3bank.a3_bank_application.dto.input.CloseRequestDTO;
import com.a3bank.a3_bank_application.dto.output.CloseResponseDTO;



public interface CloseAccountUseCase {
    CloseResponseDTO execute(CloseRequestDTO request);

}
