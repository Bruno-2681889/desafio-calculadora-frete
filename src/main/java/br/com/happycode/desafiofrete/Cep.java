package br.com.happycode.desafiofrete;

public class Cep {

    private String cep;

    public Cep(String cep) {
        validar(cep);
        this.cep = cep.replaceAll("-","");
    }

    public static void validar(String cep){

        if (cep == null) {
            throw new NullPointerException(" Cep invalido ! o formato correto deveria ser XXXXXXXX");
        }

        if (cep.length() < 8 ){
            throw new IllegalArgumentException (" Cep invalido ! o formato correto deveria ser XXXXXXXX");
        }
    }

    public String getCep() {
        return cep;
    }
}
