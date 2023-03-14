package br.caelum.exercicios.capitulo3;

/**
 * CLasse ex 8.
 */
public final class Ex8 {

    /**
     * private constructor.
     */

    private Ex8() {
    }

    /**
     * imprime uma tabela de acordo com: n n*2 n*3 .... n*n
     */

    public static void main(String[] args) {
        final int valorFinalN = 5;

        for (int i = 0; i < valorFinalN; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}
