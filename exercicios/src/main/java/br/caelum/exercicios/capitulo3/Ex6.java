package br.caelum.exercicios.capitulo3;

/**
 * Classe referente ao Ex 6.
 */

public final class Ex6 {

    /**
     * private constructor.
     */
    private Ex6() {
    }

    /**
     * imprime a sequência de fibonacci.
     */
    public static void main(String[] args) {
        final int limiteWhile = 100;
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        while (num2 <= limiteWhile) {
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
            System.out.print(num2 + " ");
        }
    }
}
