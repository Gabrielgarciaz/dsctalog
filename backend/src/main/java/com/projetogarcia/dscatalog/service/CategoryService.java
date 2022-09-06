package com.projetogarcia.dscatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetogarcia.dscatalog.entities.Category;
import com.projetogarcia.dscatalog.repositories.CategoryRepository;



@Service // Vai registrar como um componente que vai participar do sistema de injeção de dependência automatizado do spring
public class CategoryService {

	@Autowired // Injetar dependencia valida do CategoryRepository
	private CategoryRepository repository;
	
	@Transactional(readOnly = true) // Dizer para o sistema que esse método está ligado com o banco de dados / ReadOnly é para não travar o bdd somente para ler 
	public List<Category> findAll(){ // método para acessar o repository e chamar no banco de dados as categorias
		return repository.findAll(); 
	} // funcionalidade vinda do JpaRepository na Category
	
}
