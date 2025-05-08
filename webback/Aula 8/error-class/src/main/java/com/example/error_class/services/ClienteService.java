package com.example.error_class.services;
import java.util.List;

public interface ClienteService {
    List<com.example.error_class.models.ClienteDTO> listarTodos();
    com.example.error_class.models.ClienteDTO obterPorId(Long id);
    com.example.error_class.models.ClienteDTO editar(com.example.error_class.models.ClienteDTO clienteDTO);
    void excluir(Long id);
}