package com.schoolbus;
/**
 * Escreva uma descrição da classe Veculo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Veiculo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String placa, modelo;
    private int capacidade, ano;
    private Boolean alugado;
    private Contrato contrato;

    public Veiculo(String placa, String modelo, int capacidade, int ano, Contrato contrato) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.ano = ano;
        this.alugado = true;
        this.contrato = contrato;
    }


    public Veiculo(String placa, String modelo, int capacidade, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.ano = ano;
        this.alugado = false;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(Boolean alugado) {
        this.alugado = alugado;
    }

    public Contrato getContrato() {
        if (alugado) {
            return contrato;
        }
        throw  new IllegalArgumentException("Esse método é inválido para veículos não alugados.");
    }

    public void setContrato(Contrato contrato) {
        if (alugado) {
            this.contrato = contrato;
        }
    }
}
