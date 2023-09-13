package com.schoolbus;


/**
 * Escreva uma descrição da classe Contrato aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Contrato
{
    private String numero;
    private String tipoContrato;
    
    /**
     * Construtor para objetos da classe Contrato
     */
    public Contrato(String numero, String tipoContrato)
    {
        setNumero(numero);
        this.tipoContrato = tipoContrato;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }
}
