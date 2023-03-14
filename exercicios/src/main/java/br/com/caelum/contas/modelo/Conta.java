package br.com.caelum.contas.modelo;

public interface Conta {

    public double getSaldo();
    public void depositaValor(double valorOperacao);
    public void sacarValor(double valorOperacao) throws IllegalArgumentException;
    public void atualiza(double taxaSelic);
    public String getTipo();
    public String getTitular();
    public int getNumero();
    public void setAgencia(String string);
    public void setNumero(int int1);
    public void setTitular(String string);
    public void transfereValor(double double1, Conta contaReceber);
    String toString();
    public String getAgencia();
    public void setSaldo(double saldo);

}
