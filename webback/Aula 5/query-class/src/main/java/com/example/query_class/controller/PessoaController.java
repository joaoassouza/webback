package com.example.query_class.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.query_class.models.Pessoa;
import com.example.query_class.repository.PessoaRepository;
import com.example.query_class.service.PessoaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;






@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    
    @Autowired
    private PessoaRepository pessoaRepository;

    //rotas GET
    @GetMapping("")
    public List<Pessoa> getAll() {
        return pessoaService.listarPessoas();
    }

    @GetMapping("/{id}")
    public Optional<Pessoa> listaPorId(@PathVariable Long id) {
        return pessoaService.listarPorId(id);
    }
    
    //rotas POST
    @PostMapping("/cadastrar")
    public String cadastrar(@RequestBody Pessoa newPessoa) {
        pessoaService.cadastrarPessoa(newPessoa);
        return "A pessoa de nome: "+newPessoa.getNome()+" foi cadastrada!";
    }

    //rotas DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        pessoaService.excluir(id);
    }
    

    // // 🔹 Endpoint para buscar pessoas com salário maior que um determinado valor
    // @GetMapping("/salario-maior-que/{salario}")
    // public List<Pessoa> buscarPorSalarioMaiorQue(@PathVariable Double salario) {
    //     return pessoaService.buscarPorSalarioMenorOuIgual(salario);
    // }

    // // 🔹 Endpoint para buscar pessoas com salário menor ou igual a um determinado valor
    // @GetMapping("/salario-menor-ou-igual/{salario}")
    // public List<Pessoa> buscarPorSalarioMenorOuIgual(@PathVariable Double salario) {
    //     return pessoaService.buscarPorSalarioMenorOuIgual(salario);
    // }

    // // 🔹 Endpoint para buscar pessoas cujo nome começa com um determinado valor
    // @GetMapping("/nome-comeca-com/{nome}")
    // public List<Pessoa> buscarPorNomeComecaCom(@PathVariable String nome) {
    //     return pessoaService.buscarPorNomeComecaCom(nome);
    // }


}
