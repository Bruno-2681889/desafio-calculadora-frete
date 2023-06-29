package br.com.happycode.desafiofrete;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    private String nome;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private LocalDate dataAniversario;
    private Uf uf;
    private String id;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

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

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public String getIbge() {

        return ibge;
    }

    public void setIbge(String ibge) {

        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {this.id = id; }

    public String getNome() {
        return nome;
    }

    public Uf getUf() {return uf; }

    public String getCep() {return cep; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public String getLogradouro() {return logradouro; }

    public String getBairro() {return bairro; }

    public String getCidade() {return cidade; }

    @Override
    public int compareTo(Cliente outroCliente) {

        return this.getNome().compareTo(outroCliente.getNome());
    }
}
