public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public SmartTv ligar() {
        this.ligada = true;
        return this;
    }

    public SmartTv desligar() {
        this.ligada = false;
        return this;
    }

    public SmartTv aumentarVolume() {
        this.volume++;
        return this;
    }

    public SmartTv diminuirVolume() {
        this.volume--;
        return this;
    }

    public SmartTv aumentarCanal() {
        this.canal++;
        return this;
    }

    public SmartTv diminuirCanal() {
        this.canal--;
        return this;
    }

    public SmartTv mudarCanal(int canal) {
        this.canal = canal;
        return this;
    }

    public void output() {
        System.out.println("==================================");
        if (this.ligada) {
            System.out.println("A TV está ligada");

            System.out.println("Canal atual " + this.canal);
            System.out.println("Volume atual " + this.volume);
        } else {
            System.out.println("A TV está desligada");
        }
    }
}
