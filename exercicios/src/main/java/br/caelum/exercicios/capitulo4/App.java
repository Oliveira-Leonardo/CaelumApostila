package br.caelum.exercicios.capitulo4;

import br.caelum.exercicios.capitulo4.modelo.Conta;
import br.caelum.exercicios.capitulo4.modelo.Fibonacci;
import java.util.Date;

/**
 * Classe para o Capitulo 4.
 */

public final class App {
    /**
     * private constructor.
     */
    private App() {
    }

    /**
     * Classe Main apenas para testes dos exercícios.
     */
    public static void main(String[] args) {

        final int defaulSaldo = 100;
        final int defaultSacaValor = 50;
        final int defaultDepositaValor = 500;

        Date dataDeAbertuda = new Date();

        Conta conta1 = new Conta(1, "leo", defaulSaldo, dataDeAbertuda, null);
        Conta conta2 = new Conta(1, "leo", defaulSaldo, dataDeAbertuda, null);

        conta1.sacarValor(defaultSacaValor);
        System.out.println(conta1);

        conta1.depositaValor(defaultDepositaValor);
        conta1.recuperaDadosParaImpressao();

        conta1.calculaRendimentoMensal();

        if (conta1 == conta2) {
            System.out.println("sao iguais");

        } else {
            System.out.println("sao diferentes");
        }

        conta2 = conta1;

        if (conta1 == conta2) {
            System.out.println("sao iguais");

        } else {
            System.out.println("sao diferentes");
        }

        final int valorMaxFibonacci = 6;

        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= valorMaxFibonacci; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }

        final int valorMaxFibonacciRecursivo = 10;

        for (int i = 0; i < valorMaxFibonacciRecursivo; i++) {
            int resultado = fibonacci.calculaFibonacciOt(i);
            System.out.println(resultado);
        }

    }
}
