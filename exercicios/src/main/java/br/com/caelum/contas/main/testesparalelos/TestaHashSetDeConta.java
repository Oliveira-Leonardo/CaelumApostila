package br.com.caelum.contas.main.testesparalelos;

import java.util.HashSet;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaHashSetDeConta {
    public	static	void	main(String[]	args) {
        HashSet<Conta>	contas	=	new	HashSet<>();
        ContaCorrente	c1	=	new	ContaCorrente();
        c1.setNumero(1);
        c1.setAgencia("1000");
        c1.setTitular("Batman");
        ContaCorrente	c2	=	new	ContaCorrente();
        c2.setNumero(1);
        c2.setAgencia("1000");
        c2.setTitular("Robin");
        ContaCorrente	c3	=	new	ContaCorrente();
        c3.setNumero(2);
        c3.setAgencia("1000");
        c3.setTitular("Coringa");
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        System.out.println("Total	de	contas	no	HashSet:	" + contas.size());
    }

}
