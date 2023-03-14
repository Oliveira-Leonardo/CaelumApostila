package br.caelum.exercicios.capitulo4.modelo;

/**
 * Classe auxiliar apenas para uso em alguns exercicios.
 */
public class Fibonacci {
    /**
     * Faz o calculo de fibonacci.
     * @param indice
     * @return
     */
    public int calculaFibonacci(int indice) {
        if (indice <= 0) {
            return 0;
        } else if (indice == 1) {
            return 1;
        } else {
            return calculaFibonacci(indice - 1) + calculaFibonacci(indice - 2);
        }
    }

    public int calculaFibonacciOt(int n) {
        return n <= 1 ? n : calculaFibonacciOt(n - 1) + calculaFibonacciOt(n - 2);
    }

}
