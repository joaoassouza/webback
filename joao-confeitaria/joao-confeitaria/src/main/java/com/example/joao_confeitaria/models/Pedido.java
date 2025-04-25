package com.example.joao_confeitaria.models;

import com.example.joao_confeitaria.models.enumerate.StatusPedido;
import jakarta.persistence.*;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private SaboresBolo sabor;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SaboresBolo getSabor() {
        return sabor;
    }

    public void setSabor(SaboresBolo sabor) {
        this.sabor = sabor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    // Getters e setters
    
}
