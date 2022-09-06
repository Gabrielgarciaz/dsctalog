package com.projetogarcia.dscatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetogarcia.dscatalog.entities.Category;
import com.projetogarcia.dscatalog.repositories.CategoryRepository;



@Service // Vai registrar como um componente que vai participar do sistema de injeção de dependência automatizado do spring
public class CategoryService {

	@Autowired // Injetar dependencia valida do CategoryRepository
	private CategoryRepository repository;
	
	// método para acessar o repository e chamar no banco de dados as categorias
	public List<Category> findAll(){ 
		return repository.findAll(); 
	} // funcionalidade vinda do JpaRepository na Category
	
}
