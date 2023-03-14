package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
    private int numeroApolice;
    private String titular;
    private double valor;

    public String getTipo(){
        return "Seguro De Vida";
    }

    public double getValor() {
        return valor;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    @Override
    public double getValorImposto() {
        double valorImposto =  42 + (this.valor * 0.02);
        return this.valor - valorImposto;    
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }
    
}
