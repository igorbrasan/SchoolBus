package com.schoolbus;
/**
 * Escreva uma descrição da classe Escola aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Escola
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean escolaPublica;

    private Endereco endereco;
    private String cnpj, nome, telefone;
    private String tipo;

    public Escola(boolean escolaPublica, Endereco endereco, String cnpj, String nome, String telefone) {
        this.escolaPublica = escolaPublica;
        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        setTipo();
    }

    public void setEscolaPublica(boolean escolaPublica) {
        this.escolaPublica = escolaPublica;
        setTipo();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo()
    {
        if(escolaPublica)
        {
            this.tipo = "Publica";
        } else
        {
            this.tipo = "Privada";
        }
    }
}
