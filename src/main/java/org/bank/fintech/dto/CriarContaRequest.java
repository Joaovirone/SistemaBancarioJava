package org.bank.fintech.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public class CriarContaRequest {
    
    @NotBlank String titular;
    @Valid String cpf;
    Double valorDepositoInicial;
}
