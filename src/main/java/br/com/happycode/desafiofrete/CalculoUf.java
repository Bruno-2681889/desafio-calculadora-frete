package br.com.happycode.desafiofrete;

public class CalculoUf implements CalculoFrete {

    @Override
    public Frete calcular(Cliente cliente, Produto produto) {
        return null;
    }

    public Frete calcularEndereco (Endereco endereco , Produto produto){

        Double valorFrete;

        if (endereco.getUf() == Uf.SP ||endereco.getUf() == Uf.MG || endereco.getUf() == Uf.RJ ) {
            valorFrete = produto.getPreco()* 0.3;
        } else {
            valorFrete = produto.getPreco() * 0.15;
        }
    return new Frete(produto.getDescricao(),valorFrete, endereco.getUf());

    }
}
