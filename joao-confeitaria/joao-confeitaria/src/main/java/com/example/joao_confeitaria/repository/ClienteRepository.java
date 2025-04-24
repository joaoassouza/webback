package com.example.joao_confeitaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.joao_confeitaria.models.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

    
} 
