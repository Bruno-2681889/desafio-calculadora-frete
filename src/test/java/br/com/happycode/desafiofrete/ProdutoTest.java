package br.com.happycode.desafiofrete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProdutoTest {

    @Test
    public void deve_lancar_PrecoInvalidoException_quando_o_preco_for_nulo () {
        String mensagemErro="";

        try{
            Produto p1 = new Produto("Mesa", null);

        } catch (NullPointerException e) {
            mensagemErro = e.getMessage();
        }
        Assertions.assertEquals("O valor do produto, está inválido pois deve ser maior que zero!", mensagemErro);
    }

    @Test
    public void deve_lancar_PrecoInvalidoException_quando_o_preco_for_menor_ou_igual_a_zero () {
        String mensagemErro = "";

        try {
            Produto p1 = new Produto("Mesa", 0d);

        } catch (PrecoInvalidoException e) {
            mensagemErro = e.getMessage();
        }
        Assertions.assertEquals("O valor do produto, está inválido pois deve ser maior que zero!", mensagemErro);
    }
}
