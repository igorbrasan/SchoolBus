package com.schoolbus;

import java.util.ArrayList;
import java.util.Date;

/**
 * Escreva uma descrição da classe Motorista aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Motorista extends PessoaFisica
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String num_cnh, categoria_cnh;
    private Boolean terceirizado;
    public ArrayList<Contrato> contratoArrayList;

    /**
     * Motorista terceirizado com Nome social.
     *
     * @param nomeRazaoSocial
     * @param nomeSocial
     * @param naturalidadeOrigem
     * @param telefone
     * @param endereco
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param num_cnh
     * @param categoria_cnh
     * @param contrato
     * @param dataInicial
     */
    public Motorista(String nomeRazaoSocial, String nomeSocial, String naturalidadeOrigem, String telefone, Endereco endereco, String cpf, String nomePai, String nomeMae, String num_cnh, String categoria_cnh, Contrato contrato, Date dataInicial) {
        super(nomeRazaoSocial, nomeSocial, naturalidadeOrigem, telefone, endereco, cpf, nomePai, nomeMae, dataInicial);
        this.num_cnh = num_cnh;
        this.categoria_cnh = categoria_cnh;
        terceirizado = true;
        adicionarContrato(contrato);
    }

    /**
     * Motorista terceirizado sem nome social.
     *
     * @param nomeRazaoSocial
     * @param naturalidadeOrigem
     * @param telefone
     * @param endereco
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param num_cnh
     * @param categoria_cnh
     * @param contrato
     * @param dataInicial
     */
    public Motorista(String nomeRazaoSocial, String naturalidadeOrigem, String telefone, Endereco endereco, String cpf, String nomePai, String nomeMae, String num_cnh, String categoria_cnh, Contrato contrato, Date dataInicial) {
        super(nomeRazaoSocial, naturalidadeOrigem, telefone, endereco, cpf, nomePai, nomeMae, dataInicial);
        this.num_cnh = num_cnh;
        this.categoria_cnh = categoria_cnh;
        terceirizado = true;
        adicionarContrato(contrato);
    }

    /**
     * Motorista não terceirizado com nome social;
     *
     * @param nomeRazaoSocial
     * @param nomeSocial
     * @param naturalidadeOrigem
     * @param telefone
     * @param endereco
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param num_cnh
     * @param categoria_cnh
     * @param terceirizado
     * @param contrato
     * @param contratoArrayList
     * @param dataInicial
     */
    public Motorista(String nomeRazaoSocial, String nomeSocial, String naturalidadeOrigem, String telefone, Endereco endereco, String cpf, String nomePai, String nomeMae, String num_cnh, String categoria_cnh, Boolean terceirizado, Contrato contrato, ArrayList<Contrato> contratoArrayList, Date dataInicial) {
        super(nomeRazaoSocial, nomeSocial, naturalidadeOrigem, telefone, endereco, cpf, nomePai, nomeMae, dataInicial);
        this.num_cnh = num_cnh;
        this.categoria_cnh = categoria_cnh;
        this.terceirizado = false;
    }

    /**
     * Motorista não terceirizado sem nome social.
     *
     * @param nomeRazaoSocial
     * @param naturalidadeOrigem
     * @param telefone
     * @param endereco
     * @param cpf
     * @param nomePai
     * @param nomeMae
     * @param num_cnh
     * @param categoria_cnh
     * @param terceirizado
     * @param contrato
     * @param contratoArrayList
     * @param dataInicial
     */
    public Motorista(String nomeRazaoSocial, String naturalidadeOrigem, String telefone, Endereco endereco, String cpf, String nomePai, String nomeMae, String num_cnh, String categoria_cnh, Boolean terceirizado, Contrato contrato, ArrayList<Contrato> contratoArrayList, Date dataInicial) {
        super(nomeRazaoSocial, naturalidadeOrigem, telefone, endereco, cpf, nomePai, nomeMae, dataInicial);
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

    public ArrayList<Contrato> getContratos() {
        if (terceirizado) {
            return contratoArrayList;
        }
        throw  new IllegalArgumentException("Esse método é inválido para motoristas não terceirizados.");

    }

}
