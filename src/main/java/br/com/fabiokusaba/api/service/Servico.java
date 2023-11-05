package br.com.fabiokusaba.api.service;

import br.com.fabiokusaba.api.model.Cliente;
import br.com.fabiokusaba.api.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servico {
    @Autowired
    private Repositorio repositorio;

    public Cliente cadastrar(Cliente cliente) {
        return repositorio.save(cliente);
    }

    public List<Cliente> listar() {
        return repositorio.findAll();
    }

    public Cliente atualizar(Cliente cliente) {
        return repositorio.save(cliente);
    }

    public void excluir(Long codigo) {
        repositorio.deleteById(codigo);
    }
}
