package br.com.happycode.desafiofrete;

public class Frete{

    private String descricao;
    private Double valorFrete;
    private Uf uf;

    public Frete(String descricao, Double valorFrete, Uf uf) {
        this.descricao = descricao;
        this.valorFrete = valorFrete;
        this.uf = uf;
    }

    public void freteImpressao (){

        System.out.println(descricao);
        System.out.println(uf);
        System.out.println(valorFrete);
    }

    public void freteImppressao2 (){

        System.out.println(valorFrete);

    }


}
