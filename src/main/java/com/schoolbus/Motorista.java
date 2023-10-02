package com.schoolbus;

import java.util.ArrayList;

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
    public ArrayList<Contrato> contratoArrayList;

    /**
     * Construtor para motoristas terceirizados.
     * @param nomeCivil
     * @param nomeSocial
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param naturalidade
     * @param telefone
     * @param endereco
     * @param num_cnh
     * @param categoria_cnh
     * @param contrato
     */
    public Motorista(String nomeCivil, String nomeSocial, String cpf, String nomePai, String nomeMae, String naturalidade, String telefone, Endereco endereco, String num_cnh, String categoria_cnh, Contrato contrato) {
        super(nomeCivil, nomeSocial, cpf, nomePai, nomeMae, naturalidade, telefone, endereco);
        this.num_cnh = num_cnh;
        this.categoria_cnh = categoria_cnh;
        this.terceirizado = true;
        this.contrato = contrato;
    }

    /**
     * Construtor para motorista não terceirizado.
     * @param nomeCivil
     * @param nomeSocial
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param naturalidade
     * @param telefone
     * @param endereco
     * @param num_cnh
     * @param categoria_cnh
     */
    public Motorista(String nomeCivil, String nomeSocial, String cpf, String nomePai, String nomeMae, String naturalidade, String telefone, Endereco endereco, String num_cnh, String categoria_cnh) {
        super(nomeCivil, nomeSocial, cpf, nomePai, nomeMae, naturalidade, telefone, endereco);
        this.num_cnh = num_cnh;
        this.categoria_cnh = categoria_cnh;
        this.terceirizado = false;
    }

    public void adicionarContrato(Contrato contrato){
        contratoArrayList.add(contrato);
    }


    public String getNum_cnh() {
        return num_cnh;
    }

    public void setNum_cnh(String num_cnh) {
        this.num_cnh = num_cnh;
    }

    public String getCategoria_cnh() {
        return categoria_cnh;
    }

    public void setCategoria_cnh(String categoria_cnh) {
        this.categoria_cnh = categoria_cnh;
    }

    public Boolean getTerceirizado() {
        return terceirizado;
    }

    public void setTerceirizado(Boolean terceirizado) {
        this.terceirizado = terceirizado;
    }

    public Contrato getContrato() {
        if (terceirizado) {
            return contrato;
        }
        throw  new IllegalArgumentException("Esse método é inválido para motoristas não terceirizados.");

    }

    public void setContrato(Contrato contrato) {
        if (terceirizado) {
            this.contrato = contrato;
        }
    }
}
