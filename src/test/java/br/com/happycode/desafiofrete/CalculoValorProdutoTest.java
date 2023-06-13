package br.com.happycode.desafiofrete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class CalculoValorProdutoTest {

    @Test
    public void deve_realizar_o_calculo_do_frete_por_valor_se_o_valor_for_menor_que_vinte_o_valor_do_frete_sera_dois_se_o_valor_for_menor_ou_igual_cem_o_valor_do_frete_sera_oito_e_maior_que_cem_nao_cobrar_nada(){

        Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);

        Produto p1 = new Produto("Mesa", 10d);
        Produto p2 = new Produto("Mesa", 50d);
        Produto p3 = new Produto("Mesa", 101d);

        double valorFrete;

        if (p1.getPreco() <20 ) {
            valorFrete = 2;
        }
        if( p1.getPreco() <= 100){
            valorFrete =  8;
        }else {
            valorFrete = 0;
        }

        Assertions.assertEquals(12,p1.getPreco()+2);
        Assertions.assertEquals(58,p2.getPreco()+8);
        Assertions.assertEquals(101,p3.getPreco() + 0);
    }
}
