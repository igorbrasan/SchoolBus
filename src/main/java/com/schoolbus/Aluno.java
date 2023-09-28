package com.schoolbus;

/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno extends Pessoa
{
    public Escola escola;
    public Rota rota;
    private String matricula, serie;

    /**
     * Implemente um construtor para a classe Aluno que permita inicializar todos os atributos exceto a instância da classe Escola e a instância da classe Rota.
     * @param nomeCivil
     * @param nomeSocial
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param naturalidade
     * @param telefone
     * @param endereco
     * @param matricula
     * @param serie
     */
    public Aluno(String nomeCivil, String nomeSocial, String cpf, String nomePai, String nomeMae, String naturalidade, String telefone, Endereco endereco, String matricula, String serie) {
        super(nomeCivil, nomeSocial, cpf, nomePai, nomeMae, naturalidade, telefone, endereco);
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
