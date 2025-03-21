package com.example.relacionamento_exercise.models;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)

    private LocalDate dataMatricula;

    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String plano;

    //Relacionamento
    @ManyToMany
    
    
    

    //contrutor
    public Aluno(long id, String nome, int idade, LocalDate dataMatricula, String plano) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.dataMatricula = dataMatricula;
        this.plano = plano;
    }

    public Aluno(long id, String nome, int idade, String plano) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    //get e set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    //get e set
}
