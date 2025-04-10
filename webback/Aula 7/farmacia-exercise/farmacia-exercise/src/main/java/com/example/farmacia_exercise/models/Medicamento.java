package com.example.farmacia_exercise.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String bula;
    private Double preco;

    //relacionamento



    // construtores
    public Medicamento() {
    }

    public Medicamento(Long id, String nome, String bula, Double preco) {
        this.id = id;
        this.nome = nome;
        this.bula = bula;
        this.preco = preco;
    }

    // get e set
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBula() {
        return bula;
    }

    public void setBula(String bula) {
        this.bula = bula;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
