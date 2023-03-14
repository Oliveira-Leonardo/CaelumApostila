package br.caelum.exercicios.capitulo15;

import java.util.HashMap;
import java.util.Map;

import br.caelum.exercicios.capitulo4.modelo.Conta;
import br.caelum.exercicios.capitulo9.modelo.ContaCorrente;

public class TestaMap {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(0, null, 0, null, null);
        c1.depositaValor(10000);
        Conta c2 = new ContaCorrente(0, null, 0, null, null);
        c2.depositaValor(3000);

        Map<String, Conta> mapaDeContas = new HashMap<>();

        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }

}
