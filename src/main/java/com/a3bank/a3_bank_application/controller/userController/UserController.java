package com.a3bank.a3_bank_application.controller.userController;


import com.a3bank.a3_bank_application.dto.input.DeleteRequestDTO;
import com.a3bank.a3_bank_application.dto.input.LoginRequestDTO;
import com.a3bank.a3_bank_application.dto.input.SignUpRequestDTO;
import com.a3bank.a3_bank_application.dto.output.SignUpResponseDTO;
import jakarta.servlet.http.HttpServlet;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponseDTO> signUp(HttpServlet httpRequest, @Valid @RequestBody SignUpRequestDTO request) {
        log.info("Received singup request: {}", request);
        return ResponseEntity.status(HttpStatus.CREATED).body(new SignUpResponseDTO(1L, request.name(), request.email(), request.password()));

    }

    @PostMapping("/login")
    public ResponseEntity<LoginRequestDTO> login(HttpServlet httpRequest, @Valid @RequestBody LoginRequestDTO request) {
        log.info("Received login request: {}", request);
        return ResponseEntity.status(HttpStatus.CREATED).body(new LoginRequestDTO(request.cpf(),request.password()));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DeleteRequestDTO> delete(HttpServlet httpRequest, @Valid @RequestBody DeleteRequestDTO request) {
        log.info("Received delete request: {}", request);
        return ResponseEntity.status(HttpStatus.CREATED).body(new DeleteRequestDTO(request.email(),request.cpf(),request.password()));

    }
}
