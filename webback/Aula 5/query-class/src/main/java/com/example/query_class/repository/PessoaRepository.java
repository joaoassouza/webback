package com.example.query_class.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.query_class.models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
   // Método para encontrar pessoas com salário maior que um determinado valor
    @Query("SELECT p FROM Pessoa p WHERE p.salario > :salario")
    List<Pessoa> findBySalarioMaiorQue(@Param("salario") Double salario);

    // Método para encontrar pessoas com salário menor ou igual a um determinado valor
    @Query("SELECT p FROM Pessoa p WHERE p.salario <= :salario")
    List<Pessoa> findBySalarioMenorOuIgual(@Param("salario") Double salario);

    // Método para encontrar pessoas cujo nome começa com um determinado prefixo
    @Query("SELECT p FROM Pessoa p WHERE p.nome LIKE :nome%")
    List<Pessoa> findByNomeComecaCom(@Param("nome") String nome);
}