package br.caelum.exercicios.capitulo5.modelo;

/**
 * Classe auxiliar para o cap 5.
 */

public class PessoaFisica {

    /**
     * Classe auxiliar para uso em determinados exercícios.
     */

    private String cpf;

    /**
     * Construtor com parâmetro de validação de cpf.
     * @param cpf
     */
    public PessoaFisica(String cpf) {
        if (!valida(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.cpf = cpf;
    }

    /**
     * ao tentar alterar o cpf, valida o mesmo.
     * @param cpf
     */
    public void setCpf(String cpf) {
        if (!valida(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.cpf = cpf;
    }

    private boolean valida(String cpfParaValidar) {
        // codigo de validaçao de cpf
        return false;
    }

    public String getCpf() {
        return cpf;
    }

}
