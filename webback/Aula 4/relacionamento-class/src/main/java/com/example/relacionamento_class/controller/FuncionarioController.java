package com.example.relacionamento_class.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.relacionamento_class.models.Funcionario;
import com.example.relacionamento_class.service.FuncionarioService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    FuncionarioService funcionarioService;


    //listar todos
    @GetMapping
    public List<Funcionario> listAll() {
        return funcionarioService.listarTodos();
    }

    //listar por ID
    @GetMapping("{id}")
    public Optional<Funcionario> listPorId(@PathVariable Long id) {
        return funcionarioService.listarId(id);
    }
    
    //cadastrar
    @PostMapping("/cadastrar")
    public String cadastrarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.FuncionarioAdd(funcionario);
        return "Funcionario "+funcionario.getNome()+" cadastrado!";
    }


    //deletar
    @DeleteMapping("/{id}")
    public String deletearFuncionario(@RequestParam Long id){
        funcionarioService.FuncionarioPop(id);
        return "Funcionario excluido com sucesso!";
    }
    
    
}
