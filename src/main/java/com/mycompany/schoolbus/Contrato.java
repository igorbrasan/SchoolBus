package com.mycompany.schoolbus;


import java.util.ArrayList;
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

    private ArrayList<Veiculo> veiculos;
    private ArrayList<Motorista> motoristas;


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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    /**
     * Adicionar um novo veiculo ao contrato.
     * @param veiculo
     */
    public void addVeiculos(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo.getAlugado()) {
            veiculos.add(veiculo);
        } else {
            System.out.println("Este veículo não está disponível para aluguel.");
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        if (veiculos.contains(veiculo)) {
            veiculos.remove(veiculo);
            } else {
            System.out.println("Este veículo não está associado a este contrato.");
        }
    }

    public void adicionarMotorista(Motorista motorista) {
        if (motorista.getTerceirizado()) {
            motoristas.add(motorista);
        } else {
            System.out.println("Este motorista não é terceirizado.");
        }
    }

    public void removerMotorista(Motorista motorista) {
        if (motoristas.contains(motorista)) {
            motoristas.remove(motorista);
        } else {
            System.out.println("Este motorista não está associado a este contrato.");
        }
    }
    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    /**
     * Adicionar um novo motorista ao contrato
     * @param motorista
     */
    public void setMotoristas(Motorista motorista) {
        motoristas.add(motorista);
    }
}