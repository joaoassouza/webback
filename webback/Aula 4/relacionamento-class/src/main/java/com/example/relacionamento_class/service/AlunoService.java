package com.example.relacionamento_class.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relacionamento_class.models.Aluno;
import com.example.relacionamento_class.models.Funcionario;
import com.example.relacionamento_class.repository.AlunoRepository;
import com.example.relacionamento_class.repository.FuncionarioRepository;

@Service
public class AlunoService {
  // Após "indicar" o relacionamento nas classes models, é necessario ao criar um
    // aluno, associá-lo á um funcionario

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    // adicionar aluno
    public Aluno AlunoAdd(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // excluir aluno
    public void AlunoPop(Long id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Funcionário não encontrado");
        }
    }

    // listar todos
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    // Listar pot Id
    public Optional<Aluno> listarPorId(Long id) {
        return alunoRepository.findById(id);
    }

    // funcao para associar aluno_funcionario
    public void associarFuncionario(Long funcionarioId, Long alunoId) {
        Aluno aluno = alunoRepository.findById(alunoId).orElseThrow();
        Funcionario funcionario = funcionarioRepository.findById(funcionarioId).orElseThrow(null);

        aluno.getFuncionarios().add(funcionario);
        alunoRepository.save(aluno);
    }
}
