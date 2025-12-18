package org.bank.fintech.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AtualizacaoContaRequest {
    
    @NotBlank(message="O nome do titular é obrigatório")
    private String titular;

}
