package com.mycompany.schoolbus;

import java.util.Date;

/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno extends PessoaFisica
{
    public Escola escola;
    public Rota rota;
    private String matricula, serie;

    /**
     * Construtor de aluno com nome social distinto.
     *
     * @param nomeRazaoSocial
     * @param nomeSocial
     * @param naturalidadeOrigem
     * @param telefone
     * @param endereco
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param matricula
     * @param serie
     * @param dataInicial
     */
    public Aluno(String nomeRazaoSocial, String nomeSocial, String naturalidadeOrigem, String telefone, Endereco endereco, String cpf, String nomePai, String nomeMae, String matricula, String serie, Date dataInicial) {
        super(nomeRazaoSocial, nomeSocial, naturalidadeOrigem, telefone, endereco, cpf, nomePai, nomeMae, dataInicial);
        this.matricula = matricula;
        this.serie = serie;
    }

    /**
     * |Construtor de aluno com nome social igual ao nome civil.
     *
     * @param nomeRazaoSocial
     * @param naturalidadeOrigem
     * @param telefone
     * @param endereco
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param matricula
     * @param serie
     * @param dataInicial
     */
    public Aluno(String nomeRazaoSocial, String naturalidadeOrigem, String telefone, Endereco endereco, String cpf, String nomePai, String nomeMae, String matricula, String serie, Date dataInicial) {
        super(nomeRazaoSocial, naturalidadeOrigem, telefone, endereco, cpf, nomePai, nomeMae, dataInicial);
        this.matricula = matricula;
        this.serie = serie;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
