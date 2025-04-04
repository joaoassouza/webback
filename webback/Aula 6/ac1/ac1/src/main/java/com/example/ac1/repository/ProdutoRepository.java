package com.example.ac1.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1.models.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
 // Buscar todos os produtos cujo preço seja maior que R$ 32,00
    List<Produto> findByPrecoGreaterThan(Double preco);

    // Buscar todos os produtos do setor de laticínios
    List<Produto> findBySetor(String setor);

} 