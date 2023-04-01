package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa
 */
public class ExOrdemInversa {
    public static void main (String[] args) {
        int[] vetor = {1, 22, 3, 10, 8, 18};
        int[] vetorInverso = new int[6];
        int count = 0;

        for (int i : vetor) {
            vetorInverso[(vetor.length - 1) - count] = i;
            count++;

            if (count == 6) break;
        }

        System.out.println("Vetor original: ");
        for (int i : vetor) {
            System.out.print(i+" ");
        }

        System.out.println("\nVetor inverso: ");
        for (int i : vetorInverso) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
}
