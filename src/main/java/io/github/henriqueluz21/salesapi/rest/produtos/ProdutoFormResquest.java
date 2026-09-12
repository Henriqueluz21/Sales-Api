package io.github.henriqueluz21.salesapi.rest.produtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.henriqueluz21.salesapi.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoFormResquest {

    private Long id;
    private String desc;
    private String nome;
    private BigDecimal preco;
    private String sku;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    public ProdutoFormResquest() {
        super();
    }

    public ProdutoFormResquest(Long id, String desc, String nome, BigDecimal preco, String sku, LocalDate dataCadastro) {
        super();
        this.id = id;
        this.desc = desc;
        this.nome = nome;
        this.preco = preco;
        this.sku = sku;
        this.dataCadastro = dataCadastro;
    }

    public Produto toModel() {
        return new Produto(id,nome, desc, preco, sku);
    }


    public static ProdutoFormResquest fromModel(Produto produto) {
        return new ProdutoFormResquest(produto.getId(), produto.getDesc(), produto.getNome(), produto.getPreco(), produto.getSku(), produto.getDataCadastro());
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "ProdutoFormResquest{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", sku='" + sku + '\'' +
                '}';
    }
}
