package com.example.relacionamento_class.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relacionamento_class.models.Treino;
import com.example.relacionamento_class.repository.TreinoRepository;

@Service
public class TreinoService {
    @Autowired
    TreinoRepository treinoRepository;

    

    // adicionar
    public Treino treinoAdd(Treino treino) {
        return treinoRepository.save(treino);
    }

    // listar todos
    public List<Treino> listarTodos() {
        return treinoRepository.findAll();
    }

    // find por id
    public Optional<Treino> listarPorId(Long id) {
        return treinoRepository.findById(id);
    }

    // excluir
    public void excluir(Long id) {
        if (treinoRepository.existsById(id)) {
            treinoRepository.deleteById(id);
        } else
            throw new RuntimeException("Treino não encontrado");
    }

}
