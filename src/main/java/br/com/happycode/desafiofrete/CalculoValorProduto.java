package br.com.happycode.desafiofrete;

public class CalculoValorProduto implements CalculoFrete{

    @Override
    public Frete calcular(Cliente cliente, Produto produto) {
        Double valorFrete;

        if (produto.getPreco() <20 ) {
            valorFrete = produto.getPreco() + 2;
        }
            if( produto.getPreco() <= 100){
                valorFrete = produto.getPreco() + 8;
            }else {
            valorFrete = produto.getPreco();
        }

        return new Frete(produto.getDescricao(),valorFrete, cliente.getUf());
    }

}
