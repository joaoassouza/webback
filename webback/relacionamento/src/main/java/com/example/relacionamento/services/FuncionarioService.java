 package com.example.relacionamento.services;

 import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relacionamento.models.Funcionario;
import com.example.relacionamento.repository.FuncionarioRepository;

 @Service
 public class FuncionarioService {
    
    @Autowired
    FuncionarioRepository funcionarioRepository;

    //adicionar
    public Funcionario FuncionarioAdd(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    //excluir
    public void FuncionarioPop(Long id){
        if (funcionarioRepository.existsById(id)){
             funcionarioRepository.deleteById(id); 
        }
        else {
            throw new RuntimeException("usuário não encontrado");
        }
    }

    //Listar todos
    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    //Listar por id
    public Optional<Funcionario> listarId(Long id){
        return funcionarioRepository.findById(id);
    }

 }
