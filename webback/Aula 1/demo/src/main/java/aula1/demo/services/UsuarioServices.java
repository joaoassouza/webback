package aula1.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Usuario;

@Service
public class UsuarioServices {
    private final List<Usuario> usuarios = new ArrayList<>();

    //adicionar usuario à fila
    public void adicionarUsuario (Usuario usuario){
        usuarios.add(usuario);
    }

    //mostrar usuários
    public List<Usuario> listarUsuarios (){
        return usuarios;
    }

    //buscar por nome
    public Usuario buscarPorNome(String nome) {
        return usuarios.stream()
                .filter(u -> u.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null); 
    }
}
