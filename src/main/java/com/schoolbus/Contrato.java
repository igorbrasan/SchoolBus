package com.schoolbus;


import java.util.Date;


/**
 * Crie a classe Contrato com os seguintes atributos:
 *
 * num_contrato (número do contrato): tipo Integer
 *
 * data_inicio (data de início do contrato): tipo Date
 *
 * data_fim (data de término do contrato): tipo Date
 *
 * valor (valor do contrato): tipo Double
 *
 */
public class Contrato {
    private String numero;
    private Date data_inicio, data_fim;
    private double valor;

    /**
     * Implemente um construtor para a classe Contrato que permita inicializar os atributos num_contrato, data_inicio, data_fim e valor.
     * @param numero
     * @param data_inicio
     * @param data_fim
     * @param valor
     */
    public Contrato(String numero, Date data_inicio, Date data_fim, double valor) {
        this.numero = numero;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor = valor;
    }
}