package com.example.error_class.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.error_class.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    
} 