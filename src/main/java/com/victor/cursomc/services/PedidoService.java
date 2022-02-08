package com.victor.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.cursomc.domain.Pedido;
import com.victor.cursomc.repositories.PedidoRepository;
import com.victor.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
		
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
