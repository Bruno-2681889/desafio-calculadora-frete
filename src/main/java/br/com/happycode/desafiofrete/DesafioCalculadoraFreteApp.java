package br.com.happycode.desafiofrete;

/**
 * Classe responsavel por inicializar a aplicação
 * */
public class DesafioCalculadoraFreteApp {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Cliente Bruno = new Cliente("07809000","Mesa",10d,"Bruno","Av. Prefeito Angelo Seleguin","Santista","Franco da Rocha", "SP");

        int qtd = Bruno.getCEP().length();

        try{
            if (qtd != 8) {
                System.out.println("Cep invalido! o formato correto deveria ser XXXXXXXX");
            }
        } catch (IllegalArgumentException error){
            System.out.println("Cep invalido! o formato correto deveria ser XXXXXXXX");
        }

        try{
            if (Bruno.getPreco() == 0d ) {
                System.out.println("O valor do produto " + Bruno.getDescricao() + " está inválido pois deve ser maior que zero !");
            }
        } catch (NullPointerException error){
            System.out.println("O valor do produto" + Bruno.getDescricao() + " está inválido pois deve ser maior que zero !");
        }

        System.out.println(Bruno.uf);
        Bruno.modelo_impressão_geral();

    }

}
