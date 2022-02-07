package com.victor.cursomc.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victor.cursomc.domain.Endereco;



@Repository
public interface EnderecoRepository extends JpaRepository  <Endereco, Integer>{


}
