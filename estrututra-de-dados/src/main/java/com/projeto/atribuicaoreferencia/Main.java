package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        // Com tipos primitivos é passado apenas a cópia do valor da variável e nao o endereço
        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        System.out.println();

        // Com objetos, é passado a referencia de memoria, portanto ao alterar o valor do objeto inicial, o segundo
        // objeto consegue acessar o endereco do primeiro obj trazendo o valor atualizado
        // Os objetos apontam para o mesmo endereço de memória
        MeuObj meuObjA = new MeuObj(1);
        MeuObj meuObjB = meuObjA;

        System.out.println("meuObjA = " + meuObjA + " meuObjB = " + meuObjB);
        meuObjA.setNum(2);
        System.out.println("meuObjA = " + meuObjA + " meuObjB = " + meuObjB);
    }
}
