package edu.trilhajava.interfaces;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.soma(1, 1);

        calculadora.output(result);
    }
}
