package br.com.banco.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrentistaTest {

    @Test
    void deveElogiarAgencia() {
        Correntista correntista = new Correntista();

        String esperado =
                "A Ouvidoria do Banco agradece o seu contato.\n"
                + "A Agência respondeu à sua mensagem conforme segue abaixo.\n"
                + ">>A Agência agradece o seu elogio e continuará a melhorar os serviços: "
                + "Atendimento excelente no caixa eletrônico!";

        assertEquals(esperado, correntista.elogiarAgencia("Atendimento excelente no caixa eletrônico!"));
    }

    @Test
    void deveReclamarAgencia() {
        Correntista correntista = new Correntista();

        String esperado =
                "A Ouvidoria do Banco agradece o seu contato.\n"
                + "A Agência respondeu à sua mensagem conforme segue abaixo.\n"
                + ">>A Agência registrou sua reclamação e tomará as devidas providências: "
                + "Fila longa no atendimento presencial.";

        assertEquals(esperado, correntista.reclamarAgencia("Fila longa no atendimento presencial."));
    }

    @Test
    void deveSugerirAgencia() {
        Correntista correntista = new Correntista();

        String esperado =
                "A Ouvidoria do Banco agradece o seu contato.\n"
                + "A Agência respondeu à sua mensagem conforme segue abaixo.\n"
                + ">>A Agência analisará a sua sugestão para aprimorar o atendimento: "
                + "Ampliar o horário de funcionamento das agências.";

        assertEquals(esperado, correntista.sugerirAgencia("Ampliar o horário de funcionamento das agências."));
    }

    @Test
    void ouvidoriaDeveSerSingleton() {
        Ouvidoria instancia1 = Ouvidoria.getInstancia();
        Ouvidoria instancia2 = Ouvidoria.getInstancia();
        assertEquals(instancia1, instancia2,
                "Ouvidoria deve ter apenas uma instância (Singleton)");
    }

    @Test
    void agenciaDeveSerSingleton() {
        Agencia instancia1 = Agencia.getInstancia();
        Agencia instancia2 = Agencia.getInstancia();
        assertEquals(instancia1, instancia2,
                "Agência deve ter apenas uma instância (Singleton)");
    }
}
