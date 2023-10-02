package com.schoolbus;

/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author Igorbrasan
 * @version 0.1
 */
public class Pessoa {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeRazaoSocial;
    private String naturalidadeOrigem, telefone;
    private Endereco endereco;

    public Pessoa(String nomeRazaoSocial, String naturalidadeOrigem, String telefone, Endereco endereco) {
        this.nomeRazaoSocial = nomeRazaoSocial;
        this.naturalidadeOrigem = naturalidadeOrigem;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    public String getNaturalidadeOrigem() {
        return naturalidadeOrigem;
    }

    public void setNaturalidadeOrigem(String naturalidadeOrigem) {
        this.naturalidadeOrigem = naturalidadeOrigem;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}



















