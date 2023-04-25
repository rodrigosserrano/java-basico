package collection.list;

import java.util.*;

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

        System.out.println("Exibir a posiçao da nota 5 " + notas.indexOf(5d));

        // Adicione na lista a nota 8.0 na posiçao 4

        notas.add(4, 8d);

        System.out.println("Adicione na lista a nota 8.0 na posiçao 4 " + notas);

        // Substitua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5d), 6d);
        System.out.println("Substitua a nota 5.0 pela nota 6.0 " + notas);

        // confira se a nota 5.0 esta na lista

        Boolean nota5 = notas.contains(5d);

        System.out.println("confira se a nota 5.0 esta na lista " + nota5);

        // Exiba todas as notas na ordem em que foram informados
        System.out.println("Exiba todas as notas na ordem em que foram informados");
        for (Double nota : notas) System.out.println(nota);

        // Exiba a terceira nota adicionada

        System.out.println("Exiba a terceira nota adicionada " + notas.get(2));
        System.out.println(notas);

        // Exiba a menor nota

        System.out.println("Exiba menor nota " + Collections.min(notas));

        // Exiba a maior nota
        System.out.println("Exiba a maior nota " + Collections.max(notas));

        // Soma de todas as notas
        Iterator<Double> iterator = notas.iterator();

        Double somaNotas = 0d;
        while (iterator.hasNext()) {
            somaNotas += iterator.next();
        }

        System.out.println("Soma de todas as notas " + somaNotas);

        // Exiba a média das notas
        System.out.println("Exiba a média das nota " + (somaNotas/notas.size()));

        // Remova a nota 0
        notas.remove(0d);
        System.out.println("Remova a nota 0 " + notas);

        // Remova a nota da posição 0
        notas.remove(0);
        System.out.println("Remova a nota da posição 0 " + notas);

        // Remova as notas menores que 7 e exiba a lista
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            if (iterator1.next() < 7) iterator1.remove();
        }

        System.out.println("Remova as notas menores que 7 e exiba a lista " + notas);

        // Confira se a lista está vazia
        System.out.println("Confira se a lista está vazia " + notas.isEmpty());

        // Apague toda a lista
        List<Double> notasClear = new ArrayList<>();
        notasClear.addAll(notas);

        notasClear.clear();

        System.out.println("Apague toda a lista " + notasClear);

        // Confira se a lista está vazia
        System.out.println("Confira se a lista está vazia " + notasClear.isEmpty());

        ////
        System.out.println();
        ////

        // Resolva os exercícios utilizando os métodos da implementação LinkedList

        // Crie uma lista chamada notas2 e coloque todos os elementos da list ArrayList nessa
        // nova lista

        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.addAll(notas);
        System.out.println(notas);

        // Mostre a primeira nota da nova lista sem removê-lo
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo " + notas2.get(0));

        // Mostre a primeira nota da nova lista removendo-a
        System.out.println("Mostre a primeira nota da nova lista removendo-a " + notas2.removeFirst());
        System.out.println(notas2);
    }
}
