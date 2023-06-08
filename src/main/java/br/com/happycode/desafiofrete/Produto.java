package br.com.happycode.desafiofrete;

public class Produto {

    private String descricao;
    private Double preco;

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public Double getPreco() {

        return preco;
    }

    public void setPreco(Double preco) {

        this.preco = preco;
    }
}
