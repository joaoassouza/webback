package com.example.ac1.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1.models.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
  
  
    // Buscar um cliente pelo CPF
    Optional<Cliente> findByCpf(String cpf);

    // Buscar um cliente pelo número de celular
    Optional<Cliente> findByCelular(String celular);
} 