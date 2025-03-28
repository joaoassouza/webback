package com.example.relacionamento_class.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relacionamento_class.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
