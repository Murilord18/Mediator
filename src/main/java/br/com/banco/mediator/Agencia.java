package br.com.banco.mediator;

public class Agencia implements Setor {

    private static final Agencia instancia = new Agencia();

    private Agencia() {}

    public static Agencia getInstancia(){
        return instancia;
    }


    @Override
    public String receberReclamacao(String mensagem) {
        return "A Agência registrou sua reclamação e tomará as devidas providências: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "A Agência agradece o seu elogio e continuará a melhorar os serviços: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "A Agência analisará a sua sugestão para aprimorar o atendimento: " + mensagem;
    }
}
