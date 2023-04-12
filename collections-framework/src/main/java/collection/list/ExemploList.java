package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //Lista imutavel
        List<Double> notas1 = List.of(7d, 1d, 3.2);


        //Adicionar 7 notas no array

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        // Exibir a posiçao da nota 5

        System.out.println(notas.indexOf(5d));

        // Adicione na lista a nota 8.0 na posiçao 4

        notas.add(4, 8d);

        System.out.println(notas);

        // Substitua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        // confira se a nota 5.0 esta na lista

        Boolean nota5 = notas.contains(5d);

        System.out.println(nota5);

        // Exiba todas as notas na ordem em que foram informados
        for (Double nota : notas) System.out.println(nota);

    }
}
