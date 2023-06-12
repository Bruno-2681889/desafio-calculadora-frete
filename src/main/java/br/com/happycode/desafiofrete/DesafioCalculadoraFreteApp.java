package br.com.happycode.desafiofrete;

import java.time.LocalDate;

/**
 * Classe responsavel por inicializar a aplicação
 * */
public class DesafioCalculadoraFreteApp {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Frete total;

        Cliente c1 = new Cliente("Bruno","07809000","Av Angelo","Santista","Franco da Rocha", LocalDate.of(2000,02,03), Uf.SP);
        Produto p1 = new Produto("Mesa",20d);

        CalculoFrete calculoUf = new CalculoUf();
        CalculoFrete calculoValor = new CalculoValorProduto();

        Frete freteUf =  calculoUf.calcular(c1, p1);
        freteUf.freteImppressao2();

        Frete freteValor = calculoValor.calcular(c1,p1);
        freteValor.freteImpressao();

    }
}
