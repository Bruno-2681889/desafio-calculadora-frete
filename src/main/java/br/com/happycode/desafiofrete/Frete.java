package br.com.happycode.desafiofrete;

/**
 * Classe que irá conter o retorno do br.com.happycode.desafiofrete.Frete
 * */
public class Frete extends Produto implements CalculoFrete {
    UF_Enum uf;

    public Frete(String descricao, Double preco, String uf) {
        super(descricao, preco);
        this.uf = UF_Enum.valueOf(uf);
    }

    @Override
    public void calculo_uf() {

        if (this.uf == UF_Enum.SP) {
            this.setPreco(this.getPreco() * 0.3);
        }else{
            this.setPreco(this.getPreco() * 0.15);
        }

        if (this.uf == UF_Enum.SP) {
            this.setPreco(this.getPreco() * 0.3);
        }else{
            this.setPreco(this.getPreco() * 0.15);
        }

        if (this.uf == UF_Enum.RJ){
        this.setPreco(this.getPreco() * 0.3);
        }else{
            this.setPreco(this.getPreco() * 0.3);
        }
        }

    @Override
    public void calculo_valor() {
        if (getPreco() <= 10) {
            this.setPreco(getPreco() + 2);
        }
        if (getPreco() <= 100) {
            this.setPreco(this.getPreco() + 8);
        }
        if (getPreco() >= 101) {
            this.setPreco(this.getPreco() + 0);
        }
    }

    public void modelo_impressão_geral(){

        System.out.println(" ");
        System.out.println("Produto: " + this.getDescricao());
        System.out.println("UF: " + this.uf);
        System.out.println("Frete: R$" + getPreco());
    }


}
