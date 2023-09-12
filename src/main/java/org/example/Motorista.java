package org.example;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Date;

public class Motorista {
    private enum TipoContrato {0,1}
    private String nome_civil, nome_social,mae,pai,naturalidade,cpf_cnpj, rua, complemento, bairro, telefone, num_cnh, categoria_cnh, num_contrato;
    private Date data_nascimento;
    private int numero_casa, tipo;

    public Motorista(String nome_civil, String nome_social, String mae, String pai, String naturalidade, String cpf_cnpj, String rua, String complemento, String bairro, String telefone, String num_cnh, String categoria_cnh, String num_contrato, Date data_nascimento, int numero_casa, int tipo) {
        this.nome_civil = nome_civil;
        this.nome_social = nome_social;
        this.mae = mae;
        this.pai = pai;
        this.naturalidade = naturalidade;
        this.cpf_cnpj = cpf_cnpj;
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.num_cnh = num_cnh;
        this.categoria_cnh = categoria_cnh;
        this.num_contrato = num_contrato;
        this.data_nascimento = data_nascimento;
        this.numero_casa = numero_casa;
        this.tipo = tipo;
    }

    public String getNome_civil() {
        return nome_civil;
    }

    public void setNome_civil(String nome_civil) {
        this.nome_civil = nome_civil;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public String getNum_contrato() {
        return num_contrato;
    }

    public String setNum_contrato(@NotNull String num_contrato) {
        if (num_contrato.equals(TipoContrato.1){
            this.num_contrato = num_contrato;
            return "Done";
        } else{
            return "Erro: TIpo inválido para uso de contratos.";
        }
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
