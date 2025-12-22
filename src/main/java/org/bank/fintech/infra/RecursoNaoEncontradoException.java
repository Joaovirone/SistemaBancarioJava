package org.bank.fintech.infra;

public class RecursoNaoEncontradoException extends RuntimeException{
    
    public RecursoNaoEncontradoException (String mensagem){
        super(mensagem);
    }
}
