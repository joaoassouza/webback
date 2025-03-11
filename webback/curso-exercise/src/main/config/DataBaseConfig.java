package main.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public CommandLineRunner init(@Autowired CursoRepository cursoRepository){
        return arg -> {
            cursoRepository.inserir(new Curso("Curso 1"));
            cursoRepository.inserir(new Curso("Curso 2"));
            cursoRepository.obterTodos();
        };
    }
}
