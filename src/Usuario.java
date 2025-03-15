public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        smartTv.ligar();
        
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        
        
        smartTv.mudarCanal(3);
        smartTv.exibirStatus();
        
        smartTv.exibirStatus();
        
        smartTv.desligar();
        smartTv.exibirStatus();
    }
}
