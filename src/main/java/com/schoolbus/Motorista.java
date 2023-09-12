package com.schoolbus;
/**
 * Escreva uma descrição da classe Motorista aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Motorista extends Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String num_cnh, categoria_cnh;
    private Boolean terceirizado;
    private Contrato contrato;

    public Motorista(String num_cnh, String categoria_cnh)
    {
        this.num_cnh = num_cnh;
        this.terceirizado = false;
        this.categoria_cnh = categoria_cnh;
    }

    public Motorista(String num_cnh, String categoria_cnh, Contrato contrato) {
        this.num_cnh = num_cnh;
        this.categoria_cnh = categoria_cnh;
        this.terceirizado = true;
        this.contrato = contrato;
    }

}
