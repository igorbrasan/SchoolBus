package com.mycompany.schoolbus;

import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Rota aqui.
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

public class Rota
{
    private int id;
    private ArrayList<PontoDeParada>pontosDeParada;
    private static int totalDeRotas;
    
    
    public Rota(ArrayList<PontoDeParada> pontosDeParada) {
        this.pontosDeParada = pontosDeParada;
        totalDeRotas++;
        this.id = totalDeRotas;
    }


    public int getId() {
        return id;
    }


    public ArrayList<PontoDeParada> getPontosDeParada() {
        return pontosDeParada;
    }


    public static int getTotalDeRotas() {
        return totalDeRotas;
    }

    

}




/**
 * Implementação anterior
 * public class Rota
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
*/
