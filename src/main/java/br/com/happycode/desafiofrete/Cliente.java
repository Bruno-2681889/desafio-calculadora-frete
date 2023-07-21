package br.com.happycode.desafiofrete;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document("clientes")
public class Cliente implements Comparable<Cliente>{

    private String nome;
    private LocalDate dataAniversario;

@Id
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
