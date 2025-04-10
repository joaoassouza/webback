package com.example.farmacia_exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.farmacia_exercise.models.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long>{
//query functions
    
}
