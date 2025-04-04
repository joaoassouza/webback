package com.example.ac1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac1.models.Cliente;
import com.example.ac1.models.Produto;
import com.example.ac1.models.Venda;
import com.example.ac1.repository.ClienteRepository;
import com.example.ac1.repository.ProdutoRepository;
import com.example.ac1.repository.VendaRepository;

@Service
public class VendaService {

    @Autowired
    VendaRepository vendaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ClienteRepository clienteRepository;


    //Logica para relacionar cliente e venda
    public Venda registrarVenda(Long clienteId, Long produtoId, Integer quantidade) {
        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));

        Produto produto = produtoRepository.findById(produtoId)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado!"));

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setProduto(produto);
        venda.setValorTotal(produto.getPreco()*quantidade);
        venda.setDescricaoProduto(produto.getDescricao());
        venda.setPrecoProdutor(produto.getPreco());
        venda.setQuantidade(quantidade);

        return vendaRepository.save(venda);

    }

}
