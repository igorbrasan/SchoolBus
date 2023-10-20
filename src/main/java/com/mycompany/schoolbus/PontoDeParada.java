/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolbus;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * Classe PontoDeParada
 * Crie a classe PontoDeParada com os seguintes atributos:
 *      nome (nome do ponto de parada): tipo String
 *      latitude (coordenada geográfica - latitude): tipo double
 *      longitude (coordenada geográfica - longitude): tipo double
 *      id (identificador do ponto): tipo int
 *      alunos (um ArrayList de objetos Aluno) 

Implemente um construtor para a classe PontoDeParada que permita inicializar todos os atributos. 

Adicione um campo estático na classe PontoDeParada para armazenar o número total de pontos de parada criados.
 */

/**
 * 
 * @author igor-
 */
public class PontoDeParada {
    private String nome;
    private double latitude;
    private double longitude;
    private int id;
    private ArrayList<Aluno>alunos;
    private static int quantidadeDePontos;

    public PontoDeParada(String nome, double latitude, double longitude, int id, Aluno aluno) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
        alunos.add(aluno);
        quantidadeDePontos++;
    }

     public int quantosAlunos(){
        int x = 0;
        for(Iterator<Aluno> it = alunos.iterator(); it.hasNext();){
            x++;
        }
        return x;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public static int getQuantidadeDePontos() {
        return quantidadeDePontos;
    }

 
    
    
    
    
    
    
    
}
