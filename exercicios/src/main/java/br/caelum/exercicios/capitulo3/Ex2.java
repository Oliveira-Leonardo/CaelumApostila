package br.caelum.exercicios.capitulo3;

/**
 * Classe referente ao ex 2 da Apostila.
 */
public final class Ex2 {
    /**
     * Private constructo.
     */
    private Ex2() {
    }

    /**
     * Imprime a soma de todos os numeros entre 1 e 1000.
     */
    public static void main(String[] args) {
        final int inicio = 1;
        final int fim = 1001;

        int soma = 0;
        for (int i = inicio; i < fim; i++) {
            int aux = i;
            soma += aux;
        }

        System.out.println(soma);
    }
}
