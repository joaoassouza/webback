package com.example.exercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.exercicios.models.Pet;
import com.example.exercicios.services.PetServices;

@RestController
@RequestMapping("/pet")
public class PetController {
    
    @Autowired
    private PetServices petServices;

    @PostMapping("/adicionar")
    public String adicionarPet(@RequestBody Pet pet) {
        petServices.adicionarPet(pet);
        return "Pet " + pet.getNome() + " cadastrado com sucesso";
    }

    @GetMapping("/listar")
    public List<Pet> listarPets() {
        return petServices.listarPets();
    }
}
