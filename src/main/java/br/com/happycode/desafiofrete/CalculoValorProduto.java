package br.com.happycode.desafiofrete;

public class CalculoValorProduto implements CalculoFrete{

    @Override
    public Frete calcular(Cliente cliente, Produto produto) {
        return null;
    }

    @Override
    public Frete calcularEndereco(Endereco endereco, Produto produto) {

        if (produto.getPreco() < 20 )
            return new Frete(produto.getDescricao(), 2d,endereco.getUf());

        if (produto.getPreco() <= 100)
            return new Frete(produto.getDescricao(),8d,endereco.getUf());

        return new Frete(produto.getDescricao(),0d,endereco.getUf());
    }

}
