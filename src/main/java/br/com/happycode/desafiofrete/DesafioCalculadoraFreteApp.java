package br.com.happycode.desafiofrete;

import java.time.LocalDate;

/**
 * Classe responsavel por inicializar a aplicação
 * */
public class DesafioCalculadoraFreteApp {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        try {
            Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);
            Produto p1 = new Produto("Mesa", 1000d);

            CalculoFrete calculoUf = new CalculoUf();
            CalculoFrete calculoValor = new CalculoValorProduto();

            Frete freteUf = calculoUf.calcular(c1, p1);
            Frete freteValor = calculoValor.calcular(c1, p1);

            Double valorFreteTotal = freteUf.getValorFrete() + freteValor.getValorFrete();
            freteValor.freteImpressao();
            System.out.println(valorFreteTotal);

        } catch (NullPointerException e){
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (PrecoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
