package br.com.caelum.contas.modelo.modelosparalelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;

public class Banco {
    private List<Conta> contas = new ArrayList<>();
    private Map<String, Conta> indexadoPorNome = new HashMap<>();

    public void adiciona(Conta conta){
        contas.add(conta);
        indexadoPorNome.put(conta.getTitular(), conta);
    }

    public Conta pega(int posicao){
        return contas.get(posicao);
    }

    public int getQuantidadeDeContas(){
        return contas.size();
    }

    public Conta buscaPorTitular(String titular){
       for (Conta conta : contas) {
            if (conta.getTitular().equals(titular)){
                return conta;
            }
       }
        return null;
    }

    public Conta buscaPorTitularIndexado(String titular){
        return indexadoPorNome.get(titular);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contas == null) ? 0 : contas.hashCode());
        result = prime * result + ((indexadoPorNome == null) ? 0 : indexadoPorNome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Banco other = (Banco) obj;
        if (contas == null) {
            if (other.contas != null)
                return false;
        } else if (!contas.equals(other.contas))
            return false;
        if (indexadoPorNome == null) {
            if (other.indexadoPorNome != null)
                return false;
        } else if (!indexadoPorNome.equals(other.indexadoPorNome))
            return false;
        return true;
    }

    
}
