package br.com.happycode.desafiofrete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CalculoUfTest {

    @Test
    public void deve_calcular_o_valor_do_frete_em_trinta_porcento_quando_uf_for_sp(){

        Endereco e1 = new Endereco(null ,"Angelo Celeguin","Santista","Franco da Rocha", Uf.SP, "0022");

        Produto p1 = new Produto("Mesa", 10d);

        CalculoUf calculoUf = new CalculoUf();

        Frete frete = calculoUf.calcularEndereco(e1,p1);

        Assertions.assertEquals(3,frete.getValorFrete().doubleValue());

    }

    @Test
    public void deve_calcular_o_valor_do_frete_em_trinta_porcento_quando_uf_for_mg(){

        Endereco e1 = new Endereco(null ,"Angelo Celeguin","Santista","Franco da Rocha", Uf.MG, "0022");

        Produto p1 = new Produto("Mesa", 10d);

        CalculoUf calculoUf = new CalculoUf();

        Frete frete = calculoUf.calcularEndereco(e1,p1);

        Assertions.assertEquals(3,frete.getValorFrete().doubleValue());

    }

    @Test
    public void deve_calcular_o_valor_do_frete_em_trinta_porcento_quando_uf_for_rj(){

        Endereco e1 = new Endereco(null ,"Angelo Celeguin","Santista","Franco da Rocha", Uf.RJ, "0022");

        Produto p1 = new Produto("Mesa", 10d);

        CalculoUf calculoUf = new CalculoUf();

        Frete frete = calculoUf.calcularEndereco(e1,p1);

        Assertions.assertEquals(3,frete.getValorFrete().doubleValue());

    }

    @Test
    public void deve_calcular_o_valor_do_frete_em_quinze_porcento_quando_uf_nao_for_sp_mg_rj(){

        Endereco e1 = new Endereco(null ,"Angelo Celeguin","Santista","Franco da Rocha", Uf.AM, "0022");

        Produto p1 = new Produto("Mesa", 10d);

        CalculoUf calculoUf = new CalculoUf();

        Frete frete = calculoUf.calcularEndereco(e1,p1);

        Assertions.assertEquals(1.5,frete.getValorFrete().doubleValue());

    }
}
