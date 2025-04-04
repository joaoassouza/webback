package com.example.ac1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac1.models.Produto;
import com.example.ac1.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    // cadastro
    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    // listar todos
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    // Listar por id
    public Optional<Produto> listarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    // excluir
    public void excluir(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Produto não encontrardo");
        }

    }

    //relacionamento

}
