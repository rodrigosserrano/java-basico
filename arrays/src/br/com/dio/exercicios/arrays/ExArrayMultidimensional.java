package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
 */
public class ExArrayMultidimensional {
    public static void main (String[] args) {
        Random random = new Random();

        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
            }
        }

        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    int teste () {
        return 1;
    }

}
