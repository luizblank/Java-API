package com.luizblank.demo;

public class Funcionario extends Pessoas {
    public Funcionario() { }

    public void setFunc(String nome, int idade, long cpf)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getFunc()
    {
        return "Nome: " + this.nome + " | Idade: " + this.idade + " | CPF: " + this.cpf;
    }

}

