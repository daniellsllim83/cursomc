package com.Daniels.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Daniels.cursomc.domain.Categoria;
import com.Daniels.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaService service;
	//significa dizer que o end point do lista categorias vai ser /categorias/id e depois esse id vai ser passado para localizar a categoria, pois vai ser passado como parametro.
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	//para que o parametro do metodo saiba de que o id passado vem do path, passa essa anotação abaixo.
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.Buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
