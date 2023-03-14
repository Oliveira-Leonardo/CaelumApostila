package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.OperacaoInvalidaException;
import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public class ContaCorrente implements ContaTributavel  {
    static final String ContaCorrente = "Conta Corrente";
    private double saldo;
    private int numero;
    private String titular;
    private String agencia;

    @Override 
    public String getTipo() {
        return ContaCorrente;
    }

    @Override
    public void sacarValor(double valorOperacao){
        if (this.saldo < valorOperacao) {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }if (valorOperacao < 0) {
            throw new OperacaoInvalidaException("Valor inválido");
        }
        else{
            this.saldo -= valorOperacao + 0.10;
        }
    }

    @Override
    public void depositaValor(double valorOperacao) {
        if (0 == valorOperacao || valorOperacao < 0) {
            throw new OperacaoInvalidaException("Valor inválido");
        }
        else{
            this.saldo += valorOperacao;
        }
    }

    
    public void transfereValor(double valorTransferido, Conta conta) {
        sacarValor(valorTransferido);
        this.saldo += 0.10;
        conta.depositaValor(valorTransferido);
    }

    @Override
    public double getValorImposto() {
        double valorImposto = this.saldo * 0.01;
        return this.saldo - valorImposto;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void atualiza(double taxaSelic) {
        throw new UnsupportedOperationException("Unimplemented method 'atualiza'");
    }

    public static String getContacorrente() {
        return ContaCorrente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return titular.toUpperCase();
    }

    
    
}
