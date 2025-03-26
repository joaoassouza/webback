package com.example.relacionamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relacionamento.models.Aluno;
import com.example.relacionamento.models.Funcionario;
import com.example.relacionamento.repository.AlunoRepository;
import com.example.relacionamento.repository.FuncionarioRepository;

@Service
public class AlunoService {
    // Após "indicar" o relacionamento nas classes models, é necessario ao criar um
    // aluno, associá-lo á um funcionario

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    // funcao para associar
    public void associarFuncionario(Long funcionarioId, Long alunoId) {
        Aluno aluno = alunoRepository.findById(alunoId).orElseThrow();
        Funcionario funcionario = funcionarioRepository.findById(funcionarioId).orElseThrow(null);

        aluno.getFuncionarios().add(funcionario);
        alunoRepository.save(aluno);
    }
}
