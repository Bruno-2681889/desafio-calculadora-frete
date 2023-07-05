package br.com.happycode.desafiofrete.dto;

import java.time.LocalDate;

public class ClienteDto {

    private LocalDate aniversario;
    private String cep;
    private String nome;

    public String getCep() {
        return cep;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getAniversario() {return aniversario; }

}
