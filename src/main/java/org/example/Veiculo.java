package org.example;

public class Veiculo {
    private enum TipoContrato {0,1}
    private Motorista motorista;
    private String placa, modelo, contrato;
    private int ano_fabricacao, capacidade, tipo, num_contrato;

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
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

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNum_contrato() {
        return num_contrato;
    }

    public void setNum_contrato(int num_contrato) {
        this.num_contrato = num_contrato;
    }

    public Veiculo(Motorista motorista, String placa, String modelo, String contrato, int ano_fabricacao, int capacidade, int tipo, int num_contrato) {
        this.motorista = motorista;
        this.placa = placa;
        this.modelo = modelo;
        this.contrato = contrato;
        this.ano_fabricacao = ano_fabricacao;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.num_contrato = num_contrato;


    }
}
