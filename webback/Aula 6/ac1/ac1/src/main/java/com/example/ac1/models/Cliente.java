package com.example.ac1.models;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String celular;


    //relacionamento com a classe venda (1 para muitos) 
    @OneToMany(mappedBy = "cliente", cascade = jakarta.persistence.CascadeType.ALL)
    private List<Venda> vendas;


    // construtores
    public Cliente(Long id, String cpf, String celular) {
        this.id = id;
        this.cpf = cpf;
        this.celular = celular;
    }

    public Cliente() {

    }

    // get e set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
