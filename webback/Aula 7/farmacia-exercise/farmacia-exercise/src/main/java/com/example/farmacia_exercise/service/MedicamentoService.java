package com.example.farmacia_exercise.service;

import com.example.farmacia_exercise.repository.MedicamentoRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.farmacia_exercise.models.Medicamento;

@Service
public class MedicamentoService {

    @Autowired
    MedicamentoRepository medicamentoRepository;

    public void cadastrarMedicamento(Medicamento medicamento) {
        medicamentoRepository.save(medicamento);
    }

    public List<Medicamento> listarTodosMedicamentos() {
        return medicamentoRepository.findAll();
    }

    public Optional<Medicamento> listarPorIdMedicamento(Long id) {
        return medicamentoRepository.findById(id);
    }

    public Medicamento atualizarMedicamento(Long id, Medicamento _medicamento) {
        if (!!medicamentoRepository.existsById(id)) {
            throw new RuntimeException("Medicamento não encontrado com o ID: " + id);
        } else {
            Medicamento medicamentoFind = medicamentoRepository.findById(id).get();
            medicamentoFind.setNome(_medicamento.getNome());
            medicamentoFind.setBula(_medicamento.getBula());
            medicamentoFind.setPreco(_medicamento.getPreco());
            return medicamentoRepository.save(medicamentoFind);
        }
    }

    public void excluirMedicamento(long id) {
        if (!!medicamentoRepository.existsById(id)) {
            throw new RuntimeException("não foi possível encontrar o medicamento" + id);
        } else {
            medicamentoRepository.deleteById(id);
        }
    }

}
