package com.schoolbus;
import java.awt.*;

/**
 * Escreva uma descrição da classe Rota aqui.
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Rota
{
   private String pontoDePartida, pontoDeChegada;

    public Rota(String pontoDePartida, String pontoDeChegada) {
        this.pontoDePartida = pontoDePartida;
        this.pontoDeChegada = pontoDeChegada;
    }

    public String getPontoDePartida() {
        return pontoDePartida;
    }

    public void setPontoDePartida(String pontoDePartida) {
        this.pontoDePartida = pontoDePartida;
    }

    public String getPontoDeChegada() {
        return pontoDeChegada;
    }

    public void setPontoDeChegada(String pontoDeChegada) {
        this.pontoDeChegada = pontoDeChegada;
    }
}
