package org.bank.fintech.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
public class TransferenciaRequest {
    private Long idOrigem;
    private Long idDestino;
    
    @NotNull(message="O valor é obrigatório.")
    @Positive(message="O valor deve ser positivo")
    private Double valor;

}
