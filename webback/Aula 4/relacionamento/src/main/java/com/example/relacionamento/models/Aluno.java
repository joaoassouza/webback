package com.example.relacionamento.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column
    @CreatedDate
    private LocalDate dataMatricula;

    @Column(nullable = false)
    private String plano;

    // relacionamento
    // Aqui eu crio a tabela que juntará as duas colunas
    @ManyToMany
    @JoinTable(name = "aluno_funcionario",
    joinColumns = @JoinColumn (name = "funcionario_id"),
    inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private List<Funcionario> funcionarios;



    //cosntrutores
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

    // get and set
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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

}
