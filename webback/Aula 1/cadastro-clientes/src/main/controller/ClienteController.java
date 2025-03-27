package main.ClientreController;

import com.exemplo.cadastroclientes.model.Cliente;
import com.exemplo.cadastroclientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    // Endpoint para adicionar um cliente
    @PostMapping("/adicionar")
    public String adicionarCliente(@RequestBody Cliente cliente) {
        clienteService.adicionarCliente(cliente);
        return "Cliente adicionado com sucesso!";
    }

    // Endpoint para listar todos os clientes
    @GetMapping("/listar")
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }
}
