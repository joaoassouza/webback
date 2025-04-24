package com.example.joao_confeitaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.joao_confeitaria.models.Cliente;
import com.example.joao_confeitaria.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente cadastrarCliente(Cliente newCliente) {
        return clienteRepository.save(newCliente);
    }

    public void deletarCliente(Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {
            throw new RuntimeException("Cliente não encontrado");
        }
    }

    public Cliente editarCliente(Cliente clienteUpdate) {
        if (clienteRepository.existsById(clienteUpdate.getId())) {
            throw new RuntimeException("Cliente não encontrado");
        } else {
            Cliente clienteFind = clienteRepository.findById(clienteUpdate.getId()).orElseThrow();

            clienteFind.setNome(clienteUpdate.getNome());
            return clienteRepository.save(clienteFind);
        }
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> listarClienteId(Long id) {
        return clienteRepository.findById(id);
    }

}
