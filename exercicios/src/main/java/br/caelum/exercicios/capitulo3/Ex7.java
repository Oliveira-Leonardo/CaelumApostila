package br.caelum.exercicios.capitulo3;

import java.util.Scanner;

/**
 * Classe do ex 7.
 */
public final class Ex7 {

    /**
     * Construtor privado.
     */
    private Ex7() {
    }

    /**
     * Recebe um número e faz determinadas contas de acordo com ele ser par ou
     * impár.
     */
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            final int operacaoNumImpar = 3;

            System.out.print("Digite um valor para x: ");
            int x = input.nextInt();

            while (x != 1) {
                if (x % 2 == 0) {
                    x /= 2;
                } else {
                    x = operacaoNumImpar * x + 1;
                }
                System.out.print(x + " ");
            }
        }
    }
}
