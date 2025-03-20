package com.example.exercicios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.exercicios.models.Pet;
import com.example.exercicios.services.PetServices;

@services
@RequestMapping("/pet")
public class PetController {
    private List<Pet> pets = new ArrayList<>();
    
    
    //adicionar
    public void adicionarPet (Pet petNew){
        pets.add(petNew);
    }

    //listar
    public List<pet> listarPets (){
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
