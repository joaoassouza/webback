package com.example.error_class.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ClienteDTO {
    private Long id;
    private String nome;
    private int idade;

    // Converte DTO em entidade
    public Cliente toEntity() {
        return Cliente.builder()
                .id(this.id)
                .nome(this.nome)
                .idade(this.idade)
                .build();
    }

    // Converte entidade em DTO
    public static ClienteDTO fromEntity(Cliente cliente) {
        return ClienteDTO.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .idade(cliente.getIdade())
                .build();
    }
}