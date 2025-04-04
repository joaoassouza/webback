package com.example.ac1.models;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricaoProduto;
    private Integer quantidade;
    private Double precoProdutor;
    private Double valorTotal;
    private LocalDateTime dataVenda;
   
    //relacionamento venda cliente
    @ManyToOne
    @JoinColumn(name = "clienteId", nullable = false)
    private Cliente cliente;

    //relacionamento venda produto
    @ManyToOne
    @JoinColumn(name = "produtoId", nullable = false)
    private Produto produto;

    // contrutores

    public Venda(Long id, Long clienteId, Long produtoId, String descricaoProduto, Integer quantidade,
    Double precoProdutor, Double valorTotal, LocalDateTime dataVenda) {
        this.id = id;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.precoProdutor = precoProdutor;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }
    
    public Venda() {
        
    }

    // getter e setter
    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoProdutor() {
        return precoProdutor;
    }

    public void setPrecoProdutor(Double precoProdutor) {
        this.precoProdutor = precoProdutor;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

}
