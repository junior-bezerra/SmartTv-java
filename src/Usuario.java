public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminiuirVolume();
        smartTv.diminiuirVolume();
        smartTv.diminiuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);
        
        smartTv.mundarcanal(3);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
    }
}
