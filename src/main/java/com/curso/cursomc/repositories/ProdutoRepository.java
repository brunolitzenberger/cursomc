package com.curso.cursomc.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.curso.cursomc.domain.Categoria;
import com.curso.cursomc.domain.Produto;


@Repository
@Transactional()
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	Page<Produto> findDistinctByNomeContainingAndCategoriasIn(
	@Param("nome") String nome,
	@Param("categorias") List<Categoria> categorias,
	Pageable pageRequest);
}