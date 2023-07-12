package br.com.happycode.desafiofrete;

import java.time.LocalDate;

public class Cliente implements Comparable<Cliente>{

    private String nome;
    private LocalDate dataAniversario;
    private String id;
    private Endereco endereco;


    public Cliente(String nome, LocalDate dataAniversario, Endereco endereco) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.endereco = endereco;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {this.id = id; }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAniversario() {

        return dataAniversario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public int compareTo(Cliente outroCliente) {

        return this.getNome().compareTo(outroCliente.getNome());
    }
}
