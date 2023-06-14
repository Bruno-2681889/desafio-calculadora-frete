package br.com.happycode.desafiofrete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class CalculoValorProdutoTest {

    @Test
    public  void deve_calcular_o_valor_do_frete_em_dois_reais_quando_o_produto_possuir_o_preco_menor_que_vinte_reais(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);

        Produto p1 = new Produto("Mesa", 10d);

        CalculoValorProduto calculoValor = new CalculoValorProduto();

        Frete frete = calculoValor.calcular(c1,p1);

        Assertions.assertEquals(2,frete.getValorFrete().doubleValue());

    }

    @Test
    public  void deve_calcular_o_valor_do_frete_em_oito_reais_quando_o_produto_possuir_o_preco_maior_que_vinte_e_menor_ou_igual_a_cem_reais(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);

        Produto p1 = new Produto("Mesa", 30d);

        CalculoValorProduto calculoValor = new CalculoValorProduto();

        Frete frete = calculoValor.calcular(c1,p1);

        Assertions.assertEquals(8,frete.getValorFrete().doubleValue());

    }

    @Test
    public  void deve_calcular_gratis_quando_o_produto_possuir_o_valor_maior_que_cem_reais(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);

        Produto p1 = new Produto("Mesa", 101d);

        CalculoValorProduto calculoValor = new CalculoValorProduto();

        Frete frete = calculoValor.calcular(c1,p1);

        Assertions.assertEquals(0d,frete.getValorFrete().doubleValue());

    }
}
