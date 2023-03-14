package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void calculaImpostos(Evento evento) {
        total = 0;
        for (int j = 0; j < evento.getTamanhoDaLista("listaTributaveis"); j++) {
            Tributavel t = evento.getTributavel("listaTributaveis", j);
            total += t.getValorImposto();
        }

    }

}
