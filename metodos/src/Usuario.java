public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar().output();
        smartTv.aumentarVolume().output();
        smartTv.mudarCanal(22).output();
        smartTv.diminuirCanal().diminuirVolume().output();
        smartTv.desligar().output();
    }
}
