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
    
    

    /**
     * Construtor para objetos da classe Veculo
     */
    public Veiculo()
    {
        
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
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
        } return null;
    }

    public void setContrato(Contrato contrato) {
        if (alugado) {
            this.contrato = contrato;
        }
    }
}
