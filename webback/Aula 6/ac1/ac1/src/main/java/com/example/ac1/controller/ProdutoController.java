package com.example.ac1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.models.Produto;
import com.example.ac1.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    //rotas get
     @GetMapping("")
    public List<Produto> listarClientes() {
        return produtoService.listarProdutos();
    }
    
    @GetMapping("{id}")
    public Optional<Produto> getMethodName(@PathVariable Long id) {
        return produtoService.listarPorId(id);
    }

    //rota post
     @PostMapping("/cadastrar")
    public String postMethodName(@RequestBody Produto produto) {
        produtoService.cadastrarProduto(produto);        
        return "O produto cadastrado com sucesso";
    }

    //rota delete
    @DeleteMapping("{id}")
    public void deletarProduto(@PathVariable Long id){
        produtoService.excluir(id);
    }


    //relacionamento

}
