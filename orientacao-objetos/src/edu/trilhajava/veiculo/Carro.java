package edu.trilhajava.veiculo;

public class Carro extends Veiculo {

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Overloading
    public Carro() {}


}
