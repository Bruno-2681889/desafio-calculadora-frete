package br.com.happycode.desafiofrete;

public class CalculoUf implements CalculoFrete {

    public Frete calcular (Cliente cliente , Produto produto){

        Double valorFrete;

        if (cliente.getUf() == Uf.SP ||cliente.getUf() ==Uf.MG || cliente.getUf() ==Uf.RJ ) {
            valorFrete = produto.getPreco()* 0.3;
        } else {
            valorFrete = produto.getPreco() * 0.15;
        }
    return new Frete(produto.getDescricao(),valorFrete, cliente.getUf());
    }



}
