package br.com.happycode.desafiofrete;

public class PrecoInvalidoException extends RuntimeException {
    public PrecoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
