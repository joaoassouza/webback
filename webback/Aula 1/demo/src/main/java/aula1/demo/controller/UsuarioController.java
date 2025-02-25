package aula1.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import aula1.demo.services.UsuarioServices;
import model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UsuarioController {

    //autowired é para injeção de dependência, ou seja, sem ele eu precisaria instanciar uma classe UsuarioService para poder utilizar o metodo "adicionar usuario"
    @Autowired
    private UsuarioServices usuarioServices;

    // rota de cadastro dos usuários
    @PostMapping("/cadastrarUsuario")
    public String cadastrarUsuario(@RequestBody Usuario new_usuario) {
        usuarioServices.adicionarUsuario(new_usuario);

        return "usuario cadastrado com sucesso";
    }

    //rota de get
    @GetMapping("/usuariosCadastrados")
    public List<Usuario> usuariosCadastrados() {
        return usuarioServices.listarUsuarios();
    }

    @GetMapping("/usuariosCadastrados/buscar")
    public Usuario usuarioCadastradoByName(@RequestParam String nome) {
        return usuarioServices.buscarPorNome(nome);
    }
    

}
