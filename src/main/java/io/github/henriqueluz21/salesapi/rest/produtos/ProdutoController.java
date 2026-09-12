package io.github.henriqueluz21.salesapi.rest.produtos;

import io.github.henriqueluz21.salesapi.model.Produto;
import io.github.henriqueluz21.salesapi.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ProdutoFormResquest save( @RequestBody ProdutoFormResquest produto){

        Produto entidadeProduto = produto.toModel();

        repository.save(entidadeProduto);
        return ProdutoFormResquest.fromModel(entidadeProduto);
    }
}
