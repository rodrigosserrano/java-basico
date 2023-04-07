package edu.trilhajava.interfaces;

public interface OperacaoMatematica {
    double soma(double num1, double num2);

    double subtracao(double num1, double num2);

    double multiplicacao(double num1, double num2);

    double divisao(double num1, double num2);

    // Exemplo de um comportamento padrão para classes que utilizarem essa interface
    default void output(double result) {
        System.out.println("O resultado é: " + result);
    }
}