package com.projetogarcia.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogarcia.dscatalog.entities.Category;

@RestController // Avisar que vai ser uma class Rest
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){  // Método http / findAll()Busca todas categorias 
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books"));
		list.add(new Category(2L, "Electonics"));
		return ResponseEntity.ok().body(list); // OK() é uma resposta 200
	}
}
