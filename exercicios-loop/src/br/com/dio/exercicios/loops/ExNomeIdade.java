package br.com.dio.exercicios.loops;
/*
Faça um programa que leia o conjunto de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
 */

import java.util.Scanner;

public class ExNomeIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Digite o nome do aluno:");
            nome = scanner.next();

            if (nome.equals("0")) break;

            System.out.println("Digite a idade do aluno:");
            idade = scanner.nextInt();
        }

        System.out.println("Final");
    }


}
