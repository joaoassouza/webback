package com.example.query_class.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.query_class.models.Pessoa;
import com.example.query_class.repository.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository pessoaRepository;


    //cadastrar
    public Pessoa cadastrarPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    //listar todos
    public List<Pessoa> listarPessoas(){
        return pessoaRepository.findAll();
    }

    //listar por id
    public Optional<Pessoa> listarPorId(Long id) {
        return pessoaRepository.findById(id);
    } 
    
    //excluir
    public void excluir(Long id){
        if (pessoaRepository.existsById(id)){
            pessoaRepository.deleteById(id);
        }else{
            throw new RuntimeException("Pessoa não encontrado");
        }
    }
}
