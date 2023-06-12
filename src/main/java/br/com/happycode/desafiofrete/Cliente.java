package br.com.happycode.desafiofrete;

import java.time.LocalDate;

public class Cliente{

    private String nome;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private LocalDate dataAniversario;
    private Uf uf;

    public Cliente(String nome, String cep, String logradouro, String bairro, String cidade, LocalDate dataAniversario,Uf uf) {
        this.nome = nome;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.dataAniversario = dataAniversario;
        this.uf = uf;

        if (cep == null) {
            throw new NullPointerException(" Cep invalido ! o formato correto deveria ser XXXXXXXX");
        }

        if (cep.length() < 8 ){
            throw new IllegalArgumentException (" Cep invalido ! o formato correto deveria ser XXXXXXXX");
        }

        if (cep.length() >= 9){
            this.cep = cep.replaceAll("-","");
        }
    }

    public Uf getUf() {

        return uf;
    }

    public String getCep() {

        return cep;
    }


    public String getLogradouro() {

        return logradouro;
    }

    public String getBairro() {

        return bairro;
    }

    public String getCidade() {

        return cidade;
    }

}
