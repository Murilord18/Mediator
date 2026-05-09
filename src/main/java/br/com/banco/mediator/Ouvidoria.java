package br.com.banco.mediator;

public class Ouvidoria {

    private static final Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioAgencia(String mensagem) {
        return "A Ouvidoria do Banco agradece o seu contato.\n"
                + "A Agência respondeu à sua mensagem conforme segue abaixo.\n"
                + ">>" + Agencia.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoAgencia (String mensagem) {
        return "A Ouvidoria do Banco agradece o seu contato.\n"
                + "A Agência respondeu à sua mensagem conforme segue abaixo.\n"
                + ">>" + Agencia.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoAgencia (String mensagem) {
        return "A Ouvidoria do Banco agradece o seu contato.\n"
                + "A Agência respondeu à sua mensagem conforme segue abaixo.\n"
                + ">>" + Agencia.getInstancia().receberSugestao(mensagem);
    }

}
