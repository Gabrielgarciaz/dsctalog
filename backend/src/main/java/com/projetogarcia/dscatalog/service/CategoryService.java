package com.projetogarcia.dscatalog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetogarcia.dscatalog.DTO.CategoryDTO;
import com.projetogarcia.dscatalog.entities.Category;
import com.projetogarcia.dscatalog.repositories.CategoryRepository;


@Service // Vai registrar como um componente que vai participar do sistema de injeção de dependência automatizado do spring
public class CategoryService {

	@Autowired // Injetar dependencia valida do CategoryRepository
	private CategoryRepository repository;
	
	
	@Transactional(readOnly = true) // Dizer para o sistema que esse método está ligado com o banco de dados / ReadOnly é para não travar o bdd somente para ler 
	public List<CategoryDTO> findAll(){ // método para acessar o repository e chamar no banco de dados as categorias
	
		List<Category> list = repository.findAll(); 
		
		// Transformar o List Category em CategoryDTO
		
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());  // stream para funções de alta ordem -> map para transformar cada elemento original em outra coisa (aplica uma função a cada elemento da lista)
																			// Collect para transformar o stream em lista novamente					
	} // funcionalidade vinda do JpaRepository na Category
	
}


//List<Entidade>