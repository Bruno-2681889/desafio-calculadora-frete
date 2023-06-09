package br.com.happycode.desafiofrete;

import java.time.LocalDate;

public class Cliente extends Frete{

    private String nome;
    private String CEP;
    private String logradouro;
    private String bairro;
    private String cidade;
    private LocalDate data_aniversario = LocalDate.of(2023,06,02);
    int ano = data_aniversario.getYear();
    int mes = data_aniversario.getMonthValue();
    int dia = data_aniversario.getDayOfMonth();


    public Cliente(String CEP, String descricao, Double preco, String nome,String logradouro, String bairro, String cidade, String uf) {
        super(descricao,preco,uf);
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = CEP;
    }

    public void modelo_impressao_data() {
        System.out.println(this.dia + "/" + mes + "/" + ano);
    }

    private double FretePorValor(double valorProduto) {

          if (getPreco() < 20.0) {
              setPreco(getPreco() + 2);
            } else if (getPreco() >= 20.0 && getPreco() <= 100.0) {
              setPreco(getPreco() + 8);
            } else {
              setPreco(getPreco() + 0);
            }
        return getPreco();
    }


    public String getCEP() {
        return CEP;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {

        return logradouro;
    }

    public void setLogradouro(String logradouro) {

        this.logradouro = logradouro;
    }

    public String getBairro() {

        return bairro;
    }

    public void setBairro(String bairro) {

        this.bairro = bairro;
    }

    public String getCidade() {

        return cidade;
    }

    public void setCidade(String cidade) {

        this.cidade = cidade;
    }

}
