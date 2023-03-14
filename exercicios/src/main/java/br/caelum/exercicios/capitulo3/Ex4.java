package br.caelum.exercicios.capitulo3;

/**
 * CLasse referente ao ex 4.
 */
public final class Ex4 {
    /**
     * private constructor.
     */
    private Ex4() {
    }

    /**
     * imprime os fatoriais entre 1 e 10.
     */
    public static void main(String[] args) {
        final int ultimoNumeroFatorial = 10;

        for (int i = 1; i < ultimoNumeroFatorial; i++) {
            int fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println(fatorial);
        }

    }
}
