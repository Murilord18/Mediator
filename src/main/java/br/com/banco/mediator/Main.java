package br.com.banco.mediator;

public class Main {

    public static void main(String[] args) {

        Correntista correntista = new Correntista();

        System.out.println("=== ELOGIO ===");
        System.out.println(correntista.elogiarAgencia("Atendimento excelente no caixa eletrônico!"));

        System.out.println("\n=== RECLAMAÇÃO ===");
        System.out.println(correntista.reclamarAgencia("Fila longa no atendimento presencial."));

        System.out.println("\n=== SUGESTÃO ===");
        System.out.println(correntista.sugerirAgencia("Ampliar o horário de funcionamento das agências."));

    }
}
