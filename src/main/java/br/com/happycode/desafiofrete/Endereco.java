package br.com.happycode.desafiofrete;

public class Endereco {

    private Cep cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private Uf uf;
    private String ibge;

    private Endereco() {
    }

    public Endereco(Cep cep, String logradouro, String bairro, String localidade, Uf uf, String ibge) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
    }

    public Cep getCep() {return cep;}

    public Uf getUf() {
        return uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getIbge() {
        return ibge;
    }
}
