package br.caelum.exercicios.capitulo9.modelo;

import br.caelum.exercicios.capitulo4.modelo.Conta;
import java.util.Date;

/**
 * Classe auxiliar para desenvolvimento de ex.
 */

public class ContaCorrente extends Conta {

    /**
     * Construtor da classe mãe.
     */

    public ContaCorrente(int id, String nome, double saldo, Date dataDeAbertuda, String sobrnome) {
        super(id, nome, saldo, dataDeAbertuda, sobrnome);
    }

}
