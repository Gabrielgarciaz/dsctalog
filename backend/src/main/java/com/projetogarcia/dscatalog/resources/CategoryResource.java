package com.projetogarcia.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogarcia.dscatalog.DTO.CategoryDTO;
import com.projetogarcia.dscatalog.service.CategoryService;

@RestController // Avisar que vai ser uma class Rest
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired // Injetar dependencia automatica valida do CategoryService
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll(){  // Método http / findAll()Busca todas categorias 
		List<CategoryDTO> list = service.findAll();
		return ResponseEntity.ok().body(list); // OK() é uma resposta 200
	}
}
