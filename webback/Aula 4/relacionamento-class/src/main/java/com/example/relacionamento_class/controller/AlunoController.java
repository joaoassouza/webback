package com.example.relacionamento_class.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.relacionamento_class.models.Aluno;
import com.example.relacionamento_class.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
 @Autowired
    private AlunoService alunoService;

    //Endpoint para ver todos
    @GetMapping
    public List<Aluno> listarTodos(){
        return alunoService.listarTodos();
    }

    //Endpoint get by id
    @GetMapping("/{id}") 
    public Optional<Aluno> getById(@PathVariable Long id){
        return alunoService.listarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Aluno adicionar(@RequestBody Aluno aluno){
        return alunoService.AlunoAdd(aluno);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        alunoService.AlunoPop(id);
    }



    //chamando a função de associar aluno e funcionario
    @PostMapping("/{alunoId}/funcionarios/{funcionarioId}")
    public String associarfuncionario(@PathVariable Long alunoId, @PathVariable Long funcionarioId){
        alunoService.associarFuncionario(funcionarioId, alunoId);
        return "Funcionario associado com sucesso!";
    }

}
