package com.Daniels.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniels.cursomc.domain.Categoria;
import com.Daniels.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	//o spring tem essa anotação, que quando você declara uma dependencia, essa dependencia vai ser automaticamente instanciada pelo spring
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria Buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);		
	}
	
}
