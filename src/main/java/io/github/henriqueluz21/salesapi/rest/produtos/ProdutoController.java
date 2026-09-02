package io.github.henriqueluz21.salesapi.rest.produtos;

import io.github.henriqueluz21.salesapi.model.Produto;
import io.github.henriqueluz21.salesapi.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ProdutoFormResquest save( @RequestBody ProdutoFormResquest produto){

        Produto entidadeProduto = new Produto(produto.getNome(), produto.getDesc(), produto.getPreco(), produto.getSku());

        repository.save(entidadeProduto);
        System.out.println(entidadeProduto);
        return produto;
    }
}
