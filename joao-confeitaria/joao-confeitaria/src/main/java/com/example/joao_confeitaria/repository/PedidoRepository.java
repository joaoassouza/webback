package com.example.joao_confeitaria.repository;

import com.example.joao_confeitaria.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}
