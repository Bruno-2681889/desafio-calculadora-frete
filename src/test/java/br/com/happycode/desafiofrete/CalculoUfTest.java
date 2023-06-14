package br.com.happycode.desafiofrete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CalculoUfTest {

    @Test
    public void deve_calcular_o_valor_do_frete_em_trinta_porcento_quando_uf_for_sp(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);

        Produto p1 = new Produto("Mesa", 10d);

        CalculoUf calculoUf = new CalculoUf();

        Frete frete = calculoUf.calcular(c1,p1);

        Assertions.assertEquals(3,frete.getValorFrete().doubleValue());

    }

    @Test
    public void deve_calcular_o_valor_do_frete_em_trinta_porcento_quando_uf_for_mg(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.MG);

        Produto p1 = new Produto("Mesa", 10d);

        CalculoUf calculoUf = new CalculoUf();

        Frete frete = calculoUf.calcular(c1,p1);

        Assertions.assertEquals(3,frete.getValorFrete().doubleValue());

    }

    @Test
    public void deve_calcular_o_valor_do_frete_em_trinta_porcento_quando_uf_for_rj(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.RJ);

        Produto p1 = new Produto("Mesa", 10d);

        CalculoUf calculoUf = new CalculoUf();

        Frete frete = calculoUf.calcular(c1,p1);

        Assertions.assertEquals(3,frete.getValorFrete().doubleValue());

    }

    @Test
    public void deve_calcular_o_valor_do_frete_em_quinze_porcento_quando_uf_nao_for_sp_mg_rj(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.AL);

        Produto p1 = new Produto("Mesa", 10d);

        CalculoUf calculoUf = new CalculoUf();

        Frete frete = calculoUf.calcular(c1,p1);

        Assertions.assertEquals(1.5,frete.getValorFrete().doubleValue());

    }
}
