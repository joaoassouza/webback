package aula1.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    // Não é possivel fazer post pelo navegador, apenas pelo thunder, assim sendo,
    // usa-se a sintaxe para definir 2 variveis: "?n1=x&n2=y" e se retorna a soma
    @PostMapping("/soma")
    public Double somarNumber(@RequestParam("n1") double number1, @RequestParam("n2") double number2) {
        double soma = number1 + number2;
        return soma;
    }

    @PostMapping("/multiplicar")
    public double multiplyNumbers(@RequestParam("number1") double number1, @RequestParam("number2") double number2) {
        return number1 * number2;
    }

    @PostMapping("/subtrair")
    public double subtrairNumbers(@RequestParam("number1") double number1, @RequestParam("number2") double number2) {
        return number1 - number2;
    }

    @PostMapping("/dividir")
    public String dividirNumbers(@RequestParam("number1") String number1, @RequestParam("number2") String number2) {
        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (num2 == 0) {
                return "Não é possível dividir por 0";
            }

            return "Resultado: " + num1 / num2;
        } catch (NumberFormatException e) {
            return "Erro: Insira números válidos";
        }
    }
}
