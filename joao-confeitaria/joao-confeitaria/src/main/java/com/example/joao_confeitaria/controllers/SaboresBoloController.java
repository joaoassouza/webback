package main.java.com.example.joao_confeitaria.controllers;

import com.example.joao_confeitaria.models.SaboresBolo;
import com.example.joao_confeitaria.service.SaboresBoloService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sabores")
public class SaboresBoloController {
    private final SaboresBoloService saboresBoloService;

    public SaboresBoloController(SaboresBoloService saboresBoloService) {
        this.saboresBoloService = saboresBoloService;
    }

    @PostMapping
    public SaboresBolo salvar(@RequestBody SaboresBolo sabor) {
        return saboresBoloService.salvar(sabor);
    }

    @GetMapping
    public List<SaboresBolo> listarTodos() {
        return saboresBoloService.listarTodos();
    }
}
