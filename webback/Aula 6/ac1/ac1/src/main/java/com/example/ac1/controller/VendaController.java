package com.example.ac1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.models.Venda;
import com.example.ac1.service.VendaService;

@RestController
@RequestMapping("/venda")
public class VendaController {
    @Autowired
    VendaService vendaService;

    @PostMapping("/registrar")
    public Venda registrarVenda(@RequestParam Long clienteId, @RequestParam Long produtoId, @RequestParam Integer quantidade) {
        return vendaService.registrarVenda(clienteId, produtoId, quantidade);
    }
}
