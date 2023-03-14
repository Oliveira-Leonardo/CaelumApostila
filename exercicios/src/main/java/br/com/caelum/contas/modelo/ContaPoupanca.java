package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.OperacaoInvalidaException;
import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public class ContaPoupanca implements Conta {
    static final String ContaPoupanca = "Conta Poupança";
    private double saldo;
    private int numero;
    private String titular;
    private String agencia;

    @Override
    public String getTipo() {
        return ContaPoupanca;
    }

    @Override
    public void sacarValor(double valorOperacao) {
        if (this.saldo < valorOperacao) {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }if(valorOperacao < 0){
            throw new OperacaoInvalidaException("Valor Invalido");
        }
        else{
            this.saldo -= valorOperacao;
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
        this.sacarValor(valorTransferido);
        conta.depositaValor(valorTransferido);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void atualiza(double taxaSelic) {
        throw new UnsupportedOperationException("Unimplemented method 'atualiza'");
    }

    public static String getContapoupanca() {
        return ContaPoupanca;
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
