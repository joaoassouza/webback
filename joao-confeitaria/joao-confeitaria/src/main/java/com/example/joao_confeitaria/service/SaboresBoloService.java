package main.java.com.example.joao_confeitaria.service;

import com.example.joao_confeitaria.models.SaboresBolo;
import com.example.joao_confeitaria.repository.SaboresBoloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaboresBoloService {
    private final SaboresBoloRepository saboresBoloRepository;

    public SaboresBoloService(SaboresBoloRepository saboresBoloRepository) {
        this.saboresBoloRepository = saboresBoloRepository;
    }

    public SaboresBolo salvar(SaboresBolo sabor) {
        return saboresBoloRepository.save(sabor);
    }

    public List<SaboresBolo> listarTodos() {
        return saboresBoloRepository.findAll();
    }
}
