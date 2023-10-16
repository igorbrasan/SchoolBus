package com.schoolbus;
import java.util.Date;

public class PessoaJuridica extends Pessoa{
    public String cnpj, nomeFantasia, telefone;
    private Endereco endereco;

    public PessoaJuridica(String nomeRazaoSocial, String naturalidadeOrigem, String telefone, Date dataInicial, String cnpj, String nomeFantasia, String telefone1) {
        super(nomeRazaoSocial, naturalidadeOrigem, telefone, dataInicial);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone1;
    }

    public PessoaJuridica(String nomeRazaoSocial, String naturalidadeOrigem, String telefone, Endereco endereco, Date dataInicial, String cnpj, String nomeFantasia, String telefone1, Endereco endereco1) {
        super(nomeRazaoSocial, naturalidadeOrigem, telefone, endereco, dataInicial);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone1;
        this.endereco = endereco1;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
