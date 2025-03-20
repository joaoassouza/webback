package com.example.todo_exercise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

    
    @Id
    private int id;

    private String descricao;

    private boolean concluida;

}
