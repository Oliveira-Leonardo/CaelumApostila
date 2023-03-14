package br.caelum.exercicios.capitulo4.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe conta, utilizada em todo o progresso da Apostila.
 */
public class Conta {
    /**
     * variavel estática com o rendimento da conta.
     */
    public static final double RENDIMENTO_CONTA = 0.1;
    private int id;
    private String nome;
    private String sobrenome;
    private double saldo;
    private Date dataDeAbertuda;
    private String tipo;

    /**
     * Construtor do modelo Conta.
     * @param id
     * @param nome
     * @param saldo
     * @param dataDeAbertuda
     * @param sobrenome
     */

    public Conta(int id, String nome, double saldo, Date dataDeAbertuda, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.dataDeAbertuda = dataDeAbertuda;
        this.sobrenome = sobrenome;
    }

    public void sacarValor(double valorOperacao) {
        saldo -= valorOperacao;
        setSaldo(saldo);
    }

    public void depositaValor(double valorOperacao) {
        saldo += valorOperacao;
        setSaldo(saldo);
    }

    public void calculaRendimentoMensal() {
        double rendimento = this.saldo * getRendimentoConta();
        System.out.println("Rendimento Mensal Esperado: " + rendimento);
    }

    public void recuperaDadosParaImpressao() {
        System.out.println(toString());
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome + sobrenome;
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

    public String getTipo() {
        return tipo;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setDataDeAbertuda(Date dataDeAbertuda) {
        this.dataDeAbertuda = dataDeAbertuda;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "Conta [id=" + getId() + ", nome=" + getNome() + ", saldo=" + getSaldo() + ", dataDeAbertuda="
                + df.format(dataDeAbertuda) + "]";
    }
}
