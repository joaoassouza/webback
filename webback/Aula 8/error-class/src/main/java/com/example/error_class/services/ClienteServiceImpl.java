package com.example.error_class.services;

import com.example.error_class.models.ClienteDTO;
import com.example.error_class.models.Cliente;
import com.example.error_class.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDTO> listarTodos() {
        return clienteRepository.findAll()
            .stream()
            .map(cliente -> ClienteDTO.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .idade(cliente.getIdade())
                .build())
            .collect(Collectors.toList());
    }


    @Override
    public ClienteDTO obterPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado com ID: " + id));

        return ClienteDTO.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .idade(cliente.getIdade())
                .build();
    }

    @Override
    public Cliente editar(ClienteDTO clienteDTO) {
        if (!clienteRepository.existsById(clienteDTO.getId())) {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }
    
        Cliente clienteAtualizado = clienteDTO.toEntity();
        return clienteRepository.save(clienteAtualizado);
    }
    

    @Override
    public void excluir(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new IllegalArgumentException("Cliente não encontrado com ID: " + id);
        }
        clienteRepository.deleteById(id);
    }
}
