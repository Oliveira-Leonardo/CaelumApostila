package br.caelum.exercicios.capitulo5;

import br.caelum.exercicios.capitulo5.modelo.Conta;
import br.caelum.exercicios.capitulo5.modelo.PessoaFisica;
import java.util.Date;

/**
 * Classe referente ao cap 5.
 */

public final class App {

    /**
     * private constructor.
     */
    private App() {
    }

    /**
     * Classe main usada para teste dos exercícos do capítulo.
     */

    public static void main(String[] args) {
        final int defaultSaldo = 110;
        Date dataDeAbertura = new Date();

        Conta conta = new Conta(1, "oto leo", defaultSaldo, dataDeAbertura);
        Conta conta1 = new Conta(1, "oto leo", defaultSaldo, dataDeAbertura);
        Conta conta2 = new Conta(1, "oto leo", defaultSaldo, dataDeAbertura);

        conta.recuperaDadosParaImpressao();
        conta1.recuperaDadosParaImpressao();
        conta2.recuperaDadosParaImpressao();

        conta.calculaRendimentoMensal();

        PessoaFisica pessoaFisica = new PessoaFisica("null");
        pessoaFisica.getCpf();
    }

}
