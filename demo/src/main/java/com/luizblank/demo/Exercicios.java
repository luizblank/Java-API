package com.luizblank.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jayway.jsonpath.internal.function.text.Length;

import ch.qos.logback.core.subst.Token.Type;

@SpringBootApplication
public class Exercicios {
    public Exercicios() { }

    public static void exercicio1() {
        Scanner ler = new Scanner(System.in);
        float nota;
        float notas = 0;
        float media;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite a nota:");
            nota = ler.nextFloat();
            notas += nota;
        }

        media = (notas / 3);
        System.out.println("Média: " + media);

        if (media > 9) {
            System.out.println("Parabéns");
        }
        else if (media >= 7) {
            System.out.println("Aprovado");
        }
        else if (media < 3) {
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Recuperação");
        }
    }

    public static void exercicio2() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite quantos números deseja informar:\n> ");
        int numQntd = ler.nextInt();

        float[] array = new float[numQntd];

        for(int i = 0; i < numQntd; i++)
        {
            System.out.println("\nDigite o " + (i + 1) + "º número: ");
            float num = ler.nextFloat();
            array[i] = num;
        }

        float soma = 0;

        for(float item : array)
            soma += item;

        System.out.println("\nA média desses números é: " + soma);
    }

    public static void exercicio3() {
        ArrayList<Float> array = new ArrayList<Float>();
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite quantos números deseja informar:\n> ");
        float numQntd = ler.nextFloat();

        for(int i = 0; i < numQntd; i++)
        {
            System.out.println("\nDigite o " + (i + 1) + "º número: ");
            float num = ler.nextFloat();
            array.add(num);
        }

        float media = 0;

        for(float item : array)
            media += item;

        System.out.println("\nA média desses números é: " + media / array.size());
    }

    public static void exercicio4() {
        for(int i = 1000; i < 2000; i++)
        {
            if(i % 11 == 5)
                System.out.println(i);
        }
    }

    public static void exercicio5() {
        int impares = 0;

        System.out.println("Números pares:");
        for(int i = 0; i <= 1000; i++)
        {
            if(i % 2 == 0)
                System.out.print(i + " ");
            else
                impares += 1;
        }

        System.out.println("\nDe 0 a 1000 existem " + impares + " números impares.");
    }

    public static void exercicio6() {
        Funcionario funcionario1 = new Funcionario();
        Usuario usuario1 = new Usuario();

        funcionario1.setFunc("carlos", 19, 1234);
        usuario1.setUser("JOSOARES", 27, 15432);

        System.out.println(funcionario1.getFunc());
        System.out.println(usuario1.getUser());
    }

    public static void exercicio7() {
        ArrayList<Funcionario> funcList = new ArrayList<Funcionario>();
        Funcionario[] funcArray = new Funcionario[3];

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.setFunc("joao", 13, 123);
        funcionario2.setFunc("carlos", 28, 432);
        funcionario3.setFunc("marlon", 22, 797);

        funcList.add(funcionario1);
        funcList.add(funcionario2);
        funcList.add(funcionario3);

        for(int i = 0; i < 3; i++)
            funcArray[i] = funcList.get(i);

        for(Funcionario funcionario : funcList)
            System.out.println("Lista: " + funcionario.getFunc());

        System.out.println("");
        for(Funcionario funcionario : funcArray)
            System.out.println("Array: " + funcionario.getFunc());
    }

    public void exercicio8()
    {
        Scanner ler = new Scanner(System.in);
        ArrayList<Float> numbers = new ArrayList<Float>();

        System.out.print("Quantos valore você vai inserir?\n> ");
        int numbers_length = ler.nextInt();

        for(int i = 0; i < numbers_length; i++)
        {
            System.out.printf("Insira o %dº valor: ", i + 1);
            numbers.add(ler.nextFloat());
        }

        System.out.println("\nO maior número na lista é: " + Collections.max(numbers));
    }
}