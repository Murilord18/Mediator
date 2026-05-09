package br.com.banco.mediator;

public  abstract class Pessoa {

    public String elogiarAgencia(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioAgencia(mensagem);
    }

    public String reclamarAgencia(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoAgencia(mensagem);
    }

    public String sugerirAgencia(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoAgencia(mensagem);
    }
}
