package br.caelum.exercicios.capitulo14;

import java.util.Date;

import br.caelum.exercicios.capitulo4.modelo.Conta;
import br.caelum.exercicios.capitulo9.modelo.ContaCorrente;

public class App {
    public static void main(String[] args) {
        Date data = new Date();
        Conta[] contas = new Conta [10];
        double total = 0;
        

        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente(i, null, i, data, null);
            conta.depositaValor(i * 100 );
            contas[i] = conta;
            System.out.println(contas[i]);
        }

        for (Conta conta : contas) {
            total += conta.getSaldo();
        }
        System.out.println(total);
        double media = total / contas.length;
        System.out.println(media);

        String frase = "Socorram-me, subi no ônibus em Marrocos";
        String[] palavras = frase.split(" ");
        String novaFrase = "";
        for (int i = palavras.length - 1; i >= 0; i--) {
            novaFrase += palavras[i] + " ";
        }
        System.out.println(novaFrase.trim());
    }
    
}
