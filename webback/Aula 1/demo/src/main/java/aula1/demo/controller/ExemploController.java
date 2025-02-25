package aula1.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ExemploController {

    // Metodo get que, quando na url padrão, executará o "hello world"
    @GetMapping(value = "/")
    public String getMethodName() {
        return "Olá Mundo";
    }

    // Metodo no qual armazena na String "paramValue" graças a anotação RequestParam
    // do springboot. Para testar, usar "/teste?param='parametro'"
    @GetMapping("/teste")
    public String getData(@RequestParam(value = "param") String paramValue) {
        return "O valor do parâmetro é: " + paramValue;
    }

    // Passar parâmetro plea URL via Pathvariable. /testePath/(parametro) -> sem
    // necessidade de interrogação, apenas separa por barra
    @GetMapping("/testePath/{param}")
    public String getDataPath(@PathVariable("param") String paramValue) {
        return "O valor do parâmetro com PathVariable é: " + paramValue;
    }

    // metodo delete
    @DeleteMapping("/produto/{id}")
    public String deleteRecord(@PathVariable("id") Long id) {
        return "Id excluído: " + id;
    }

}
