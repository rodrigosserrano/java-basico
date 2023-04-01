package br.com.dio.exercicios.arrays;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */

import java.util.Scanner;

public class ExConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letras = new char[6];
        int count = 0;
        int countConsoantes = 0;

        do {
            System.out.print("Digite uma letra: ");
            letras[count] = scanner.next().toLowerCase().charAt(0);
            count++;
        } while(count < letras.length);

        System.out.print("As consoantes são: ");
        for (char l : letras) {
            if (isConsonant(l)) {
                System.out.print(l + " ");
                countConsoantes++;
            }
        }

        System.out.println("\nA quantidade de consoantes são: "+countConsoantes);
    }

    private static boolean isConsonant(char charToCheck) {
        for (char i : new char[]{'a', 'e', 'i', 'o', 'u' }) {
            if (i == charToCheck) {
                return false;
            }
        }
        return true;
    }
}
