package com.example.error_class.controller;

import com.example.error_class.models.ClienteDTO;
import com.example.error_class.models.Cliente;
import com.example.error_class.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Cliente obterPorId(@PathVariable Long id) {
        return clienteService.obterPorId(id);
    }

    @PutMapping
    public Cliente editar(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.editar(clienteDTO);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        clienteService.excluir(id);
    }
}

