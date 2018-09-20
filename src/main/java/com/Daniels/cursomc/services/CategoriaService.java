package com.Daniels.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniels.cursomc.domain.Categoria;
import com.Daniels.cursomc.repositories.CategoriaRepository;
import com.Daniels.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	//o spring tem essa anotação, que quando você declara uma dependencia, essa dependencia vai ser automaticamente instanciada pelo spring
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);		
		return obj.orElseThrow (() -> new ObjectNotFoundException("Objeto não encontrado!!! Id  " + id + "  Tipo de categoria " + Categoria.class.getName()));
	}
}

