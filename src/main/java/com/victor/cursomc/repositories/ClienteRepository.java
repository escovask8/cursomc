package com.victor.cursomc.repositories;
import com.victor.cursomc.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public interface ClienteRepository extends JpaRepository  <Cliente, Integer>{

    @Transactional(readOnly=true)
	Cliente findByEmail(String email);

}
