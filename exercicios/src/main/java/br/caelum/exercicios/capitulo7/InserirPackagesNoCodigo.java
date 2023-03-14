package br.caelum.exercicios.capitulo7;

import br.caelum.exercicios.capitulo4.modelo.Conta;

/**
 * classe para o cap 7.
 */

public final class InserirPackagesNoCodigo {

    /**
     * private constructor.
     */

    private InserirPackagesNoCodigo() {
    }

    /**
     * Capitulo ensinando a utilização de packages assim como sua criação.
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("packagesOK");

        Conta conta = new Conta(0, null, 0, null, null);
        conta.getId();
    }
}
