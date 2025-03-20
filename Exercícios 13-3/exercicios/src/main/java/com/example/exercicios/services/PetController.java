package com.example.exercicios.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.exercicios.models.Pet;

@RequestMapping("/pet")
public class PetController {
    private List<Pet> pets = new ArrayList<>();
    
    
    //adicionar
    public void adicionarPet (Pet petNew){
        pets.add(petNew);
    }

    //listar
    public List<Pet> listarPets (){
        return pets;
    }

    //excluir
    public boolean excluir(int id) {
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            if (pet.getId() == id) {
                iterator.remove();
                return true; 
            }
        }
        return false; 
    }

  
}
