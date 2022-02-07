package com.victor.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.cursomc.domain.Categoria;
import com.victor.cursomc.repositories.CategoriaRepository;
import com.victor.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
		
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
