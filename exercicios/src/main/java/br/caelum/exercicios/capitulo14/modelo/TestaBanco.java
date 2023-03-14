package br.caelum.exercicios.capitulo14.modelo;

import java.util.Date;

import br.caelum.exercicios.capitulo5.modelo.Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Date dataAbertuda = new Date();
        Banco banco = new Banco("CaelumBank", 999);
        
        Conta conta1 = new Conta(0, null, 0, dataAbertuda);
        Conta conta2 = new Conta(0, null, 0, dataAbertuda);
        Conta conta3 = new Conta(0, null, 0, dataAbertuda);
        Conta conta4 = new Conta(0, null, 0, dataAbertuda);
        
        banco.adiciona(conta1);
        banco.adiciona(conta2);
        banco.adiciona(conta3);
        banco.adiciona(conta4);

        for (int i = 0; i < banco.getContas().length; i++) {
            System.out.println(banco.getContas());
        }
    }
}
