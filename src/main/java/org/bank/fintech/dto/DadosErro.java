package org.bank.fintech.dto;

import java.time.LocalDateTime;


public record DadosErro(
    LocalDateTime timestamp,
    Integer status,
    String error,
    String message,
    String path) {
    
}
