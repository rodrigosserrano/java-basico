package edu.trilhajava.veiculo;

public class Veiculo {
    protected String cor;
    protected String modelo;
    protected int capacidadeTanque;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double valorTotalTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
