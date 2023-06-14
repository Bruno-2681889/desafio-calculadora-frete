package br.com.happycode.desafiofrete;

public class CalculoValorProduto implements CalculoFrete{

    @Override
    public Frete calcular(Cliente cliente, Produto produto) {

        if (produto.getPreco() < 20 )
            return new Frete(produto.getDescricao(), 2d,cliente.getUf());

        if (produto.getPreco() <= 100)
            return new Frete(produto.getDescricao(),8d,cliente.getUf());

        return new Frete(produto.getDescricao(),0d, cliente.getUf());
    }
}
