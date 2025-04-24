package com.example.joao_confeitaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.joao_confeitaria.models.Pedido;

public interface PedidoRepository extends JpaRepository <Long, Pedido> {

    
} 
