package br.caelum.exercicios.capitulo14.modelo;

import java.util.Arrays;

import br.caelum.exercicios.capitulo5.modelo.*;

public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas = new Conta [10];

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Conta[] getContas() {
        return contas;
    }

    public void adiciona(Conta conta) {
        contas[conta.getIdentificador()] = conta;
    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", numero=" + numero + ", contas=" + Arrays.toString(contas) + "]";
    }

    
}
