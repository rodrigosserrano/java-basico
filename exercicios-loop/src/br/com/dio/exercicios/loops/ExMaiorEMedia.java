package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 numeros
e informe o maior número
e a média desses números
 */

public class ExMaiorEMedia {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int numero;
        int maior = 0;
        int sum = 0;

        do {
            System.out.println("Digite o " + (count +1) + "° número: ");
            numero = scanner.nextInt();

            if (numero > maior) maior = numero;

            sum += numero;
            count++;
        } while (count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (sum/5));

    }
}
