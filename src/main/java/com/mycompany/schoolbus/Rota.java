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
    
    
    public Rota(PontoDeParada ponto) {
        pontosDeParada.add(ponto);
        totalDeRotas++;
        this.id = totalDeRotas;
    }


    public int getId() {
        return id;
    }

    public void addPonto(PontoDeParada ponto){
        pontosDeParada.add(ponto);
    }

    public ArrayList<PontoDeParada> getPontosDeParada() {
        return pontosDeParada;
    }


    public static int getTotalDeRotas() {
        return totalDeRotas;
    }

    /**
     * Implemente um método na classe Rota para calcular a demanda total da rota com base na associação dos alunos aos pontos de parada.
     * Esse método deve percorrer todos os alunos associados a cada ponto de parada da rota e somar suas demandas.
     */
    
    
    public void demandasPorRota(){
        int x = 0;
        for(PontoDeParada pontoDeParada:pontosDeParada){
        x++;
        String result = ("O ponto de parada: " + pontoDeParada.getNome() + 
        " com o ID: " + pontoDeParada.getId() + 
        " possui " + pontoDeParada.quantosAlunos() + " alunos.");
        System.out.println(result);
    }
    System.out.printf("Há um total de %d pontos de parada Nessa rota", x);
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
*/
