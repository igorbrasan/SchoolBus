package com.schoolbus;

/**
 * Classe que descreve a entidade escola no sistema SchoolBus
 * Futuramente deve ser usada como ponto de destino para o schoolBus por meio do parametro endereço.
 * @author Igor Braga
 * @version 1.0
 */
public class Escola
{
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
/*
* Define se a escola é pública ou privada
* @param boolean, true caso a escola seja pública.
* */
    public void setEscolaPublica(boolean escolaPublica) {
        this.escolaPublica = escolaPublica;
        setTipo();
    }
/**
 * Busca o valor da subClasse Endereço
 * @see Endereco
 */
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
