package br.com.fabiokusaba.api.controller;

import br.com.fabiokusaba.api.model.Cliente;
import br.com.fabiokusaba.api.service.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controle {
    @Autowired
    private Servico servico;

    @GetMapping
    public List<Cliente> listar() {
        return servico.listar();
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return servico.cadastrar(cliente);
    }

    @PutMapping
    public Cliente atualizar(@RequestBody Cliente cliente) {
        return servico.atualizar(cliente);
    }

    @DeleteMapping("{codigo}")
    public void excluir(@PathVariable("codigo") Long codigo) {
        servico.excluir(codigo);
    }
}
