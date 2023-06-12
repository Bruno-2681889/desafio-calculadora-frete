package br.com.happycode.desafiofrete;

public class Produto {

    private String descricao;
    private Double preco;


    public Produto(String descricao, Double preco) throws PrecoInvalidoException {
        if (preco == null || preco <= 0) {
            throw new PrecoInvalidoException("O valor do produto " + descricao + " está inválido pois deve ser maior que zero !");
        }

        this.descricao = descricao;
        this.preco = preco;

    }

    public String getDescricao() {

        return descricao;
    }

    public Double getPreco() {

        return preco;
    }

}
