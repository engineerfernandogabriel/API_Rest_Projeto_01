package com.produtos.projeto01_apirest.repository;

import com.produtos.projeto01_apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

