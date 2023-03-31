package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
Ex.: 5! = 120
 */
public class ExFatorial {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial: ");
        int fatorial = scanner.nextInt();
        int calcFatorial = 1;

        for (int i = fatorial; i >= 1; i--) {
            calcFatorial *= i;
        }

        System.out.println("Fatorial de "+ fatorial +" é "+ calcFatorial);
    }
}
