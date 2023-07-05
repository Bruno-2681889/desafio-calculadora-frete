package br.com.happycode.desafiofrete;

public interface CalculoFrete {

    Frete calcular (Cliente cliente , Produto produto);
    Frete calcularEndereco (Endereco endereco , Produto produto);
}
