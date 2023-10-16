package com.schoolbus;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


/**
 * Classe que descreve a entidade escola no sistema SchoolBus
 * Futuramente deve ser usada como ponto de destino para o schoolBus por meio do parametro endereço.
 * @author Igor Braga
 * @version 1.0
 */
public class Escola extends PessoaJuridica
{
    private boolean escolaPublica;
    private ArrayList<Aluno> alunos;
        private String tipo;

    public Escola(String nomeRazaoSocial, String naturalidadeOrigem, String telefone, Date dataInicial, String cnpj, String nomeFantasia, String telefone1, boolean escolaPublica) {
        super(nomeRazaoSocial, naturalidadeOrigem, telefone, dataInicial, cnpj, nomeFantasia, telefone1);
        this.escolaPublica = escolaPublica;
        setTipo();
    }

    /**
     *MAtricular um aluno à escola.
     * @param aluno
     */
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }

    /**
     * Na classe Escola, implemente um método para exibir todos os alunos matriculados na escola. Devem ser listados a matrícula, CPF, nome social e série do aluno.
     * @return
     */
    public void listAlunos(){
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
