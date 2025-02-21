package aula1.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.NumeroDTO;

//para cada model, entidade, cria-se uma classe controller, para acessar os metodos REST do model. No caso esta classe é um controller da entidade NumeroDTO
@RestController
public class NumeroDTOController {

    //o método post "requestBody" faz com que os parâmetros são pego do body. E no próprio return é feito a soma.
    @PostMapping("/somarDTO")
    public Double createProduct(@RequestBody NumeroDTO numeros) {
        return numeros.getNumero1() + numeros.getNumero2();
    }

   
}
