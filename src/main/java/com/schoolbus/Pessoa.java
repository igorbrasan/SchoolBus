package com.schoolbus;
/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;
    private String nomeCivil, nomeSocial, cpf, nomePai, nomeMae; 
    private String naturalidade, telefone;
    private Endereco endereco;
    
    
    /**
     * Construtor para objetos da classe Pessoa
     */
    public Pessoa()
    {
        // inicializa variáveis de instância
        x = 0;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int sampleMethod(int y)
    {
        // escreva seu código aqui
        return x + y;
    }
}
