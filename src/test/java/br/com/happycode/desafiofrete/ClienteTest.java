package br.com.happycode.desafiofrete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ClienteTest {

    @Test
    public void deve_lancar_illegalArgumentException_quando_o_cep_possuir_menos_de_oito_digitos () {
        String mensagemErro = "";

        try {
            new Cliente("Bruno", "078090", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);

        } catch (IllegalArgumentException e) {
            mensagemErro = e.getMessage();
        }
            Assertions.assertEquals(" Cep invalido ! o formato correto deveria ser XXXXXXXX", mensagemErro);
    }

    @Test
    public void deve_lancar_NullPointerException_quando_o_cep_for_nulo(){
        String mensagemErro="";

        try{
            new Cliente("Bruno", null, "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);

        } catch (NullPointerException e) {
            mensagemErro = e.getMessage();
        }
            Assertions.assertEquals(" Cep invalido ! o formato correto deveria ser XXXXXXXX", mensagemErro);
    }
    @Test
    public void deve_remover_hifen_do_cep(){

            Cliente c1 = new Cliente("Bruno", "07809-000", "Av Angelo", "Santista", "Franco da Rocha", LocalDate.of(2000, 02, 03), Uf.SP);

            Assertions.assertEquals("07809000", c1.getCep());
    }

}
