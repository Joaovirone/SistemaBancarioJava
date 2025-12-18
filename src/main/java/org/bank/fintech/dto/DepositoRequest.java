package org.bank.fintech.dto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class DepositoRequest {

    @NotNull(message="O valor é obrigatório.")
    @Positive(message="O valor deve ser positivo")
    Double valor;

}