package com.projetogarcia.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetogarcia.dscatalog.entities.Category;




@Repository    // Componente injetável 
public interface CategoryRepository extends JpaRepository <Category, Long>{ // <TipoEntidade, TipoID>

}

// JpaRepository vai liberar diversas funções prontas 