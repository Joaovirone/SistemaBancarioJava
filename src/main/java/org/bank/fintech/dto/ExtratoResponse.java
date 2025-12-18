package org.bank.fintech.dto;
import org.bank.fintech.model.*;
import java.util.*;
import lombok.Data;

import lombok.*;

@Data
@NoArgsConstructor
public class ExtratoResponse {
    
    private String titular;
    private Double saldoAtual;
    private List<Transacao> historico;


    public ExtratoResponse(String titular, Double saldoAtual, List<Transacao> historico){
        this.titular = titular;
        this.saldoAtual = saldoAtual;
        this.historico = historico;
    }
}
