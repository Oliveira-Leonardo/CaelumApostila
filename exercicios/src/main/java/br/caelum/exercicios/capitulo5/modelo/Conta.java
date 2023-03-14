package br.caelum.exercicios.capitulo5.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe Conta alterada de acordo com o exercício em questão, porém não fora
 * mais utilizada.
 */
public class Conta {
    /**
     * variavel estática com rendimento das contas.
     */
    private static final double RENDIMENTO_CONTA = 0.1;
    private static int identicadorContas = 1;
    private int id;
    private String nome;
    private double saldo;
    private Date dataDeAbertuda;
    private int identificador;

    /**
     * Construtor alterado de acordo com o exercício.
     */

    public Conta(int id, String nome, double saldo, Date dataDeAbertuda) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.dataDeAbertuda = dataDeAbertuda;
        this.identificador = identicadorContas;
        aumentaIdentificador();
    }

    private void aumentaIdentificador() {
        identicadorContas++;

    }

    public int getIdentificador() {
        return identificador;
    }

    public void sacarValor(double valor) {
        this.saldo -= valor;
    }

    public void depositaValor(double valor) {
        this.saldo += valor;
    }

    public void calculaRendimentoMensal() {
        double rendimento = this.saldo * getRendimentoConta();
        System.out.println("Rendimento Mensal Esperado: " + rendimento);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataDeAbertuda() {
        return dataDeAbertuda;
    }

    public static double getRendimentoConta() {
        return RENDIMENTO_CONTA;
    }

    public void recuperaDadosParaImpressao() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "Identificador da Conta" + getIdentificador() + "[id=" + id + ", nome=" + nome + ", saldo=" + saldo
                + ", dataDeAbertuda=" + df.format(dataDeAbertuda) + "]";
    }

}
