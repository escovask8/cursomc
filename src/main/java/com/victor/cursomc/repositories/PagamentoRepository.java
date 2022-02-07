package com.victor.cursomc.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victor.cursomc.domain.Pagamento;



@Repository
public interface PagamentoRepository extends JpaRepository  <Pagamento, Integer>{


}
