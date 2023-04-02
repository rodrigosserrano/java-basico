package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */
public class ExNumerosAleatorios {
    public static void main (String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = random.nextInt(100);
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\n");

        System.out.print("Números aleatórios e seus sucessores: ");
        for (int numero : numeros) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("\n");
    }
}
