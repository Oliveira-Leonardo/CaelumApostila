package br.caelum.exercicios.capitulo3;

/**
 * Classe referente ao ex 5.
 */

public final class Ex5 {

    /**
     * private constructor.
     */

    private Ex5() {
    }

    /**
     * imprime os fatoriais entre 1 e 40.
     */
    public static void main(String[] args) {
        final int valorMaximoFatorial = 40;

        for (double i = 1; i < valorMaximoFatorial; i++) {
            double fatorial = 1;
            for (double j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println(fatorial);
        }

    }
}
