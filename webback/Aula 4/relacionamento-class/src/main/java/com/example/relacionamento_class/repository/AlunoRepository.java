package com.example.relacionamento_class.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relacionamento_class.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
