package com.example.joao_confeitaria.controller;

import com.example.joao_confeitaria.models.Pedido;
import com.example.joao_confeitaria.models.enumerate.StatusPedido;
import com.example.joao_confeitaria.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @PatchMapping("/{id}/status")
    public Pedido atualizarStatus(@PathVariable Long id, @RequestParam StatusPedido status) {
        return pedidoService.atualizarStatus(id, status);
    }
}
