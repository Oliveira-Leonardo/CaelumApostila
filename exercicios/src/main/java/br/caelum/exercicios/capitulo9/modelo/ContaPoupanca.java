package br.caelum.exercicios.capitulo9.modelo;

import br.caelum.exercicios.capitulo4.modelo.Conta;
import java.util.Date;

/**
 * Classe auxiliar do cap 9.
 */

public class ContaPoupanca extends Conta {
    /**
     * Construtor da classe mãe.
     */
    public ContaPoupanca(int id, String nome, double saldo, Date dataDeAbertuda, String sobrenome) {
        super(id, nome, saldo, dataDeAbertuda, sobrenome);
    }
}
