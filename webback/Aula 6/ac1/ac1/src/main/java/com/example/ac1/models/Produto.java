package com.example.ac1.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double preco;
    private String setor;
    private LocalDate dataValidade;

    //relacionamento com a classe venda (1 para muitos)
    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<Venda> vendas;



    //contrutores
    public Produto(Long id, String descricao, Double preco, String setor, LocalDate dataValidade) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.setor = setor;
        this.dataValidade = dataValidade;
    }

    public Produto (){

    }

    //get e sets
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }





}
