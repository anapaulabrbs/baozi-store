package br.com.anapaula.baozistore.repository;

import br.com.anapaula.baozistore.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}