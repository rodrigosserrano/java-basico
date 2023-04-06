package edu.trilhajava.veiculo;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Branco", "Passat", 50);

        App.output(carro1, 5.10);

        Carro carro2 = new Carro();

        carro2.setModelo("Escort");
        carro2.setCor("Cinza");
        carro2.setCapacidadeTanque(45);

        App.output(carro2, 5.10);

        App.upcastingClass();
    }

    private static void upcastingClass() {
        // É pego a classe filha e transformada na classe pai, ou seja, consigo usar os métodos que só existem na classe pai
        // por ex.
        Veiculo veiculo = new Carro("Branco", "Up", 40);

        System.out.println(veiculo.getModelo());
    }
    private static void output(Carro carro) {
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Cor do carro: " + carro.getCor());
        System.out.println("Capacidade do tanque do carro: " + carro.getCapacidadeTanque());
        System.out.println();
    }

    private static void output(Carro carro, double valorCombustivel) {
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Cor do carro: " + carro.getCor());
        System.out.println("Capacidade do tanque do carro: " + carro.getCapacidadeTanque());
        double tanqueCarro = carro.valorTotalTanque(valorCombustivel);
        System.out.println("Total para encher o tanque: " + tanqueCarro);
        System.out.println();
    }
}
