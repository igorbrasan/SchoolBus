package com.schoolbus;

/**
 * QUadro de horários em que um veículo irá saír, com qual motorista, que data, que horário, e qual rota irá seguir.
 * Uma meta-entidade organizadora?.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Programacao{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public Veiculo veiculo;
    public Rota rota;
    public Motorista motorista;
    public String dataHora;

    public Programacao(Veiculo veiculo, Rota rota, Motorista motorista, String dataHora) {
        this.veiculo = veiculo;
        this.rota = rota;
        this.motorista = motorista;
        this.dataHora = dataHora;
    }



    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}
