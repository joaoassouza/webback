package com.example.relacionamento_class.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cargo;

    @CreatedDate
    private LocalDate dataContratacao = LocalDate.now();

    // relacionamento
    // Relacionando com a tabela já criada em alunos
    @ManyToMany(mappedBy = "funcionarios")
    private List<Aluno> alunos;

    

    public Funcionario() {
    }

    // construtores
    public Funcionario(long id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public Funcionario(long id, String nome, String cargo, LocalDate dataContratacao) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
