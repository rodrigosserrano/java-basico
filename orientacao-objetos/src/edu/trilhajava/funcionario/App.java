package edu.trilhajava.funcionario;

public class App {
    public static void main (String[] args) {
        // Upcasting
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        // Downcasting - evitar
        Vendedor funcionario = (Vendedor) new Funcionario();
    }
}
