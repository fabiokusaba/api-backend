package br.com.fabiokusaba.api.repository;

import br.com.fabiokusaba.api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends JpaRepository<Cliente, Long> {
}
