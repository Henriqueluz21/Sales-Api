package io.github.henriqueluz21.salesapi.model.repository;

import io.github.henriqueluz21.salesapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}
