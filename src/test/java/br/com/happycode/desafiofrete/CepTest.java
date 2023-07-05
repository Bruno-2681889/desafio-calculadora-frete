package br.com.happycode.desafiofrete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CepTest {

    @Test
    public void deve_lancar_illegalArgumentException_quando_o_cep_possuir_menos_de_oito_digitos () {

    String mensagemErro = "";

        try {
            new Cep("0780900");

        } catch (IllegalArgumentException e) {
            mensagemErro = e.getMessage();
        }
            Assertions.assertEquals(" Cep invalido ! o formato correto deveria ser XXXXXXXX", mensagemErro);
    }

    @Test
    public void deve_lancar_NullPointerException_quando_o_cep_for_nulo(){
        String mensagemErro="";

        try{
           new Cep(null);

        } catch (NullPointerException e) {
            mensagemErro = e.getMessage();
        }
            Assertions.assertEquals(" Cep invalido ! o formato correto deveria ser XXXXXXXX", mensagemErro);
    }
//    @Test
//    public void deve_remover_hifen_do_cep(){
//
//            new Cep("07809-000");
//
//            Assertions.assertEquals("07809000");
//    }
}
