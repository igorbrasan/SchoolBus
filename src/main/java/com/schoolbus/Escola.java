package com.schoolbus;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe que descreve a entidade escola no sistema SchoolBus
 * Futuramente deve ser usada como ponto de destino para o schoolBus por meio do parametro endereço.
 * @author Igor Braga
 * @version 1.0
 */
public class Escola
{
    private boolean escolaPublica;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private Endereco endereco;
    private String cnpj, nome, telefone;
    private String tipo;

    public Escola(boolean escolaPublica, Endereco endereco, String cnpj, String nome, String telefone) {
        this.escolaPublica = escolaPublica;
        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
        setTipo();
    }
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }

    /**
     * Na classe Escola, implemente um método para exibir todos os alunos matriculados na escola. Devem ser listados a matrícula, CPF, nome social e série do aluno.
     * @return
     */
    public Aluno listAlunos(){
        for(Iterator<Aluno> it = alunos.iterator(); it.hasNext();){
            Aluno elem = it.next();
            System.out.println(elem.getNomeSocial());
            System.out.println(elem.getMatricula());
            System.out.println(elem.getCpf());
            System.out.println(elem.getSerie());
        }

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
