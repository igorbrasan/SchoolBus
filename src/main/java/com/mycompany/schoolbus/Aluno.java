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
    public PontoDeParada pontoDeParada;
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
     * 
     * @return
     */
    public Escola getEscola() {
        return escola;
    }

    /**
     * 
     * @param escola
     */
    public void setEscola(Escola escola) {
        this.escola = escola;
    }
    /**
     * 
     * @return
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * 
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
/**
 * 
 * @return
 */
    public String getSerie() {
        return serie;
    }
/**
 * 
 * @param serie
 */
    public void setSerie(String serie) {
        this.serie = serie;
    }
/**
 * 
 * @return
 */
    public PontoDeParada getPontoDeParada() {
        return pontoDeParada;
    }
/**
 * 
 * @param pontoDeParada
 */
    public void setPontoDeParada(PontoDeParada pontoDeParada) {
        this.pontoDeParada = pontoDeParada;
    }
}
