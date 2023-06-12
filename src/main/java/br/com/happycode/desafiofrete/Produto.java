package br.com.happycode.desafiofrete;

public class Produto {

    private String descricao;
    private Double preco;

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;

        if (preco == null) {
            throw new NullPointerException("O valor do produto, está inválido pois deve ser maior que zero!");
        }

        if (preco <=0){
            throw new PrecoInvalidoException ("O valor do produto, está inválido pois deve ser maior que zero!");
        }
    }

    public String getDescricao() {

        return descricao;
    }

    public Double getPreco() {

        return preco;
    }

}
