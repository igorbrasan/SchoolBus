package com.schoolbus;


/**
 * Escreva uma descrição da classe Endereco aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Endereco
{
    private String nomeDaRua, complemento, bairro;
    private  int numero;

    /**
     * \Inicializa a instancia
     * @param nomeDaRua
     * @param complemento
     * @param bairro
     * @param numero
     */
    public Endereco(String nomeDaRua, String complemento, String bairro, int numero) {
        this.nomeDaRua = nomeDaRua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
