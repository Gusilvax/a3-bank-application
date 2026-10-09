package com.a3bank.a3_bank_application.controller.userController;

import com.a3bank.a3_bank_application.dto.input.SignUpRequestDTO;
import com.a3bank.a3_bank_application.dto.output.SignUpResponseDTO;
import jakarta.servlet.http.HttpServlet;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponseDTO> signUp(HttpServlet httpRequest, @Valid @RequestBody SignUpRequestDTO request){
       log.info("Received sign up request: {}", request);
    }


}
