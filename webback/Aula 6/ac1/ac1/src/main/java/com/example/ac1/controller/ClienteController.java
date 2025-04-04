package com.example.ac1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1.models.Cliente;
import com.example.ac1.service.ClienteService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;


    //rotas get
    @GetMapping("")
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }
    
    @GetMapping("{id}")
    public Optional<Cliente> getMethodName(@PathVariable Long id) {
        return clienteService.listarPorId(id);
    }
    

    //rotas post
    @PostMapping("/cadastrar")
    public String postMethodName(@RequestBody Cliente cliente) {
        clienteService.cadastrarCliente(cliente);        
        return "O cliente de cpf: "+cliente.getCpf()+" foi cadastrado com sucesso!";
    }


    //rotas delete
    @DeleteMapping("{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteService.excluir(id);
    }
    
    
}
