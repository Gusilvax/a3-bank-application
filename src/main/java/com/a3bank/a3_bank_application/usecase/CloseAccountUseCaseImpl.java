package com.a3bank.a3_bank_application.usecase;


import com.a3bank.a3_bank_application.dto.input.CloseRequestDTO;
import com.a3bank.a3_bank_application.dto.output.CloseResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service

public class CloseAccountUseCaseImpl implements CloseAccountUseCase {

    @Override
    public CloseResponseDTO execute(CloseRequestDTO request) {
        log.info("Executing CloseAccountUseCase with request: {}", request);
        return new CloseResponseDTO("Account closed successfully");
    }


}
