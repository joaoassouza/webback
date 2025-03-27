package main.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Id;

@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String laboratorio;
    private BigDecimal preco;
    private LocalDate dataDeValidade;
    
    //contrutores
    public Medicamento(int id, String nome, String laboratorio, BigDecimal preco, LocalDate dataDeValidade) {
        this.id = id;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }
    
    public Medicamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }


    //get e set 
    

    
}   
