package com.example.relacionamento_class.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relacionamento_class.models.Funcionario;
import com.example.relacionamento_class.repository.FuncionarioRepository;

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
