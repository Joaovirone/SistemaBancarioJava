package org.bank.fintech.repository;

import org.bank.fintech.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface TransacaoRepository extends JpaRepository<Transacao, Long>{
    
    List<Transacao> findByContaId(Long contaId);
}
