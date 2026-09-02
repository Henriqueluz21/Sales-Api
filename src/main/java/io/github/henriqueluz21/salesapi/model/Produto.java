package io.github.henriqueluz21.salesapi.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Produto")
public class Produto {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100 )
    private String nome;

    @Column(name = "descricao", length = 255 )
    private String desc;

    @Column(name = "preco", precision = 16, scale = 2)
    private BigDecimal preco;

    @Column
    private String sku;

    public String getSku() {
        return sku;
    }

    public Produto() {
        super();
    }

    public Produto(String nome, String desc, BigDecimal preco, String sku) {
        super();
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
        this.sku = sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", desc='" + desc + '\'' +
                ", preco=" + preco +
                ", sku='" + sku + '\'' +
                '}';
    }
}
