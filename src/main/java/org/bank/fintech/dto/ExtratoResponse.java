package org.bank.fintech.dto;
import org.bank.fintech.model.*;
import java.util.*;
public class ExtratoResponse {
    
    private String titular;
    private Double saldoAtual;
    private List<Transacao> historico;


    public ExtratoResponse(String titular, Double saldoAtual, List<Transacao> historico){
        this.titular = titular;
        this.saldoAtual = saldoAtual;
        this.historico = historico;
    }

    public String getTitular(){
        return titular;
    }

    public Double getSaldoAtual(){
        return saldoAtual;
    }
    
    public List<Transacao> getHistorico(){
        return historico;
    }
}
