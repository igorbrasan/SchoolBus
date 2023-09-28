package com.schoolbus;

/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author Igorbrasan
 * @version 0.1
 */
public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeCivil, nomeSocial, cpf, nomePai, nomeMae; 
    private String naturalidade, telefone;
    private Endereco endereco;

    public Pessoa(String nomeCivil, String nomeSocial, String cpf, String nomePai, String nomeMae, String naturalidade, String telefone, Endereco endereco) {
        this.nomeCivil = nomeCivil;
        this.nomeSocial = nomeSocial;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.naturalidade = naturalidade;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Pessoa(String nomeCivil, String cpf, String nomePai, String nomeMae, String naturalidade, String telefone, Endereco endereco) {
        this.nomeCivil = nomeCivil;
	this.nomeSocial = nomeCivil;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.naturalidade = naturalidade;
        this.telefone = telefone;
        this.endereco = endereco;
        
    }

    public String getNomeCivil() {
        return nomeCivil;
    }

    public void setNomeCivil(String nomeCivil) {
        this.nomeCivil = nomeCivil;
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

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
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
