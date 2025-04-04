package com.example.ac1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac1.models.Cliente;
import com.example.ac1.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    // cadastro
    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // listar todos
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    // Listar por id
    public Optional<Cliente> listarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    // excluir
    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }

    //relacionamento

}
