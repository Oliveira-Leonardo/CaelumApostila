package br.caelum.exercicios.capitulo3;

/**
 * classe referente ao ex 9.
 */

public final class Ex9 {

    /**
     * private constructor.
     */
    private Ex9() {
    }

    /**
     * Exercicio parecido com o anterior, porém utilizando menos varíaveis.
     */
    public static void main(String[] args) {

        final int n = 10;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
