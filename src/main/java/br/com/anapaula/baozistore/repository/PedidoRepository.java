package br.com.anapaula.baozistore.repository;

import br.com.anapaula.baozistore.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}