package org.bank.fintech.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
public class SaqueRequest {
    
    @NotNull(message="O valor é obrigatório")
    @Positive(message="O valor deve ser maior que 0 (Zero)")
    private Double valor;

}
