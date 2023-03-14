package br.caelum.exercicios.capitulo3;

/**
 * Exercio numero 1.
 */
public final class Ex1 {
    /**
     * Construtor privado.
     */
    private Ex1() {
    }

    /**
     * Imprime de 150-300.
     */
    public static void main(String[] args) {
        final int inicial = 150;
        final int fim = 301;

        for (int i = inicial; i < fim; i++) {
            System.out.println(i);
        }
    }

}
