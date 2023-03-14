package br.com.caelum.contas;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

    private Conta conta;

    public void criaConta(Evento evento) {
        String tipo = evento.getSelecionadoNoRadio("tipo");

        this.conta = tipo.equals("Conta Corrente") ? new ContaCorrente() : new ContaPoupanca();

        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setTitular(evento.getString("titular"));

    }

    public void deposita(Evento evento) {
        double valorDigitado = evento.getDouble("valorOperacao");
        this.conta.depositaValor(valorDigitado);
    }

    public void saca(Evento evento) {
        double valorDigitado = evento.getDouble("valorOperacao");

        if (this.conta.getTipo().equals("Conta Corrente")) {
            conta.sacarValor(valorDigitado);
        }else{
            this.conta.sacarValor(valorDigitado);
        }
    }

    public void transfere(Evento evento){
        Conta contaReceber = (Conta) evento.getSelecionadoNoCombo("destino");
         conta.transfereValor(evento.getDouble("valorTransferencia"),contaReceber );
    }

    public void salvaDados(Evento evento) throws FileNotFoundException{
        List<Conta> contas = evento.getLista("listaContas");
        RepositorioDeContas repositorioDeContas = new RepositorioDeContas();
        repositorioDeContas.salva(contas);
    }

    public List<Conta> carregaDados(){
        RepositorioDeContas repositorioDeContas = new RepositorioDeContas();
        return repositorioDeContas.carrega();
    }

}
