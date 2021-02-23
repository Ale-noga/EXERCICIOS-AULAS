package com.drogale.drogale.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drogale.drogale.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	List<Categoria>findAllByComposicaoContainingIgnoreCase(String composicao);
	
}
