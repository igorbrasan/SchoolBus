package com.mycompany.schoolbus;


/**
 * Escreva uma descrição da classe Endereco aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Endereco
{
    private String nomeDaRua, complemento, bairro;
    private  int numero;

    /**
     * \Inicializa a instancia
     * @param nomeDaRua
     * @param complemento
     * @param bairro
     * @param numero
     */
    public Endereco(String nomeDaRua, String complemento, String bairro, int numero) {
        this.nomeDaRua = nomeDaRua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.numero = numero;
    }
    /**
     * Get value of Numero.
     * @return 
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Setter pro número da casa, prédio ou terreno em Endereço
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Retorna o nome da rua.
     * @return 
     */
    public String getNomeDaRua() {
        return nomeDaRua;
    }
    /**
     * Seta o nome da rua.
     * @param nomeDaRua 
     */
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }
    /**
     * Retorna o valor do Complemento. 
     * @return 
     */
    public String getComplemento() {
        return complemento;
    }
    /**
     * Seta o valor Complemento. Exemplos: Proximo ao mercado X; Bloco z apartamento j; ao lado da farmácia k...
     * @param complemento 
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    /**
     * Getter para o Bairro
     * @return 
     */
    public String getBairro() {
        return bairro;
    }
    /**
     * Setter para o Bairro
     * @param bairro 
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    /**
     * Concatena os valores: @nomeDaRua, @numero, @bairro, e @complemento, e os retorna em uma só string. 
     * Criado para facilitar consultas por classes que tenham um Endereço.
     * @return 
     */
    public String toString(){
        String end = (nomeDaRua + ", " + numero + ", " + bairro + ", " + complemento);
        return end;
    }
}
