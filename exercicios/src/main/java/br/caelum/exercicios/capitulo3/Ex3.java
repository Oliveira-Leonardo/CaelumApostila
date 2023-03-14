package br.caelum.exercicios.capitulo3;

/**
 * Classe referente ao Ex 3 da Apostila.
 */
public final class Ex3 {
    /**
     * Private constructor.
     */
    private Ex3() {
    }

    /**
     * Imprime todos os multiplos de 3 entre 1 e 100.
     */
    public static void main(String[] args) {
        final int fimForExterno = 101;
        final int dividido = 3;

        for (int i = 0; i < fimForExterno; i++) {
            if (i % dividido == 0) {
                System.out.println(i);
            }
        }
    }
}
