package com.luizblank.demo.exercises;

public class Usuario extends Pessoas {
    public Usuario() { }

    public void setUser(String nome, int idade, long cpf)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getUser()
    {
        return "Nome: " + this.nome + " | Idade: " + this.idade + " | CPF: " + this.cpf;
    }
}