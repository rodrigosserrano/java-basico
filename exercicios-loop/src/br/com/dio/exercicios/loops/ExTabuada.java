package br.com.dio.exercicios.loops;

import java.awt.*;
import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */
public class ExTabuada {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para gerar tabuada entre 1 e 10: ");
        int numeroTabuada = scanner.nextInt();

        while (numeroTabuada <= 0 || numeroTabuada > 10) {
            System.out.println("Valor inválido, digite um número inteiro para gerar tabuada entre 1 e 10: ");
            numeroTabuada = scanner.nextInt();
        }

        System.out.println("Tabuada de " + numeroTabuada + ":");
        for(int i = 0; i <= 10; i++) {
            System.out.println(numeroTabuada + " X " + i + " = " + (numeroTabuada*i));
        }
    }
}
