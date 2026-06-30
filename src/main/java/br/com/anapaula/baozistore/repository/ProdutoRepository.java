package br.com.anapaula.baozistore.repository;

import br.com.anapaula.baozistore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}