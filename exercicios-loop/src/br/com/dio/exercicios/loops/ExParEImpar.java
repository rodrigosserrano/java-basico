package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */
public class ExParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de entradas: ");
        int qtdEntradas = scanner.nextInt();

        int count = 0;
        int sumPares = 0;
        int sumImpares = 0;
        int numero;

        do {
            System.out.println("Digite o " + (count+1) + "° número: ");
            numero = scanner.nextInt();

            if (numero %2 == 0)
                sumPares++;
            else
                sumImpares++;

            count++;
        } while (count < qtdEntradas);

        System.out.println("A quantidade de pares foram: " + sumPares);
        System.out.println("A quantidade de impares foram: " + sumImpares);
    }
}
