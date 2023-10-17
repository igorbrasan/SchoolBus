package com.mycompany.schoolbus;

import java.util.Date;

public class Secretaria {
    public static void main(String[]args){
        System.out.println("Test");
        Pessoa al01;
        Date data = new Date();
        al01 = new Pessoa("Marcos","Soteropolitano", "71988888888",data);
        Endereco end01 = new Endereco("Rua marechal de abrantes", "bar do farofa", "cajacity", 20);
        al01.setEndereco(end01);
        Aluno aluno = new Aluno(al01.getNomeRazaoSocial(), al01.getNaturalidadeOrigem(), al01.getTelefone(), al01.getEndereco(), "88888888888", "mateus", "Luciana", "217115555", "8", al01.getDataInicial());
        System.out.println(aluno.showEndereco());
    }
}

