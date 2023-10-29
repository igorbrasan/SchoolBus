package com.mycompany.schoolbus;

import java.util.Date;

public class PessoaFisica extends Pessoa{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeSocial, cpf, nomePai, nomeMae;

    /**
     * Construtor para pessoa Física com nome Civil e nome Social
     * @param nomeRazaoSocial
     * @param nomeSocial
     * @param naturalidadeOrigem
     * @param telefone
     * @param endereco
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param dataInicial
     */
    public PessoaFisica(String nomeRazaoSocial, String nomeSocial, String naturalidadeOrigem, String telefone, Endereco endereco, String cpf, String nomePai, String nomeMae, Date dataInicial) {
        super(nomeRazaoSocial, naturalidadeOrigem, telefone, endereco, dataInicial);
        this.nomeSocial = nomeSocial;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;

    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
}
