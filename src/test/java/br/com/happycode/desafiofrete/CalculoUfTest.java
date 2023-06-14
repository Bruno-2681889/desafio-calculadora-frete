package br.com.happycode.desafiofrete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CalculoUfTest {

    @Test
    public void deve_realizar_o_calculo_do_frete_por_uf_se_uf_for_igual_SP_RJ_MG_o_valor_do_frete_devera_ser_trinta_porcento_do_valor_do_produto_caso_contrário_o_valor_do_frete_sera_quinze_porcento(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);
        Cliente c2 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.MG);
        Cliente c3 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.RJ);
        Cliente c4 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.AM);

        Produto p1 = new Produto("Mesa", 10d);

        double valorFrete;

        if (c1.getUf() == Uf.SP || c1.getUf() ==Uf.MG || c1.getUf() ==Uf.RJ ) {
            valorFrete = p1.getPreco()* 0.3;

        } else {
            valorFrete = p1.getPreco() * 0.15;
        }

        Assertions.assertEquals(3,valorFrete);

        if (c2.getUf() == Uf.SP ||c2.getUf() ==Uf.MG || c2.getUf() ==Uf.RJ ) {
            valorFrete = p1.getPreco()* 0.3;
        } else {
            valorFrete = p1.getPreco() * 0.15;
        }

        Assertions.assertEquals(3,valorFrete);

        if (c3.getUf() == Uf.SP ||c3.getUf() ==Uf.MG || c3.getUf() ==Uf.RJ ) {
            valorFrete = p1.getPreco()* 0.3;
        } else {
            valorFrete = p1.getPreco() * 0.15;
        }

        Assertions.assertEquals(3,valorFrete);

        if (c4.getUf() == Uf.SP ||c4.getUf() ==Uf.MG || c4.getUf() ==Uf.RJ ) {
            valorFrete = p1.getPreco()* 0.3;
        } else {
            valorFrete = p1.getPreco() * 0.15;
        }

        Assertions.assertEquals(1.5,valorFrete);
    }

}
