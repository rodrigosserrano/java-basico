package edu.trilhajava;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String print() {
        return "Carro da marca " + this.modelo + " sendo da cor " + this.cor + " com capacidade do tanque de " + this.capacidadeTanque + "L";
    }
}
