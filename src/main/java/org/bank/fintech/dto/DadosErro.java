package org.bank.fintech.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class DadosErro{
    LocalDateTime timestamp;
    Integer status;
    String error;
    String message;
    String path;
    }
