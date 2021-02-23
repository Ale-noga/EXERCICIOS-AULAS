package com.drogale.drogale.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drogale.drogale.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto>findAllByNomeContainingIgnoreCase(String nome);
}
