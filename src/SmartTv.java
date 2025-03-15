public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
    boolean mudo = false;
    final int VOLUME_MAXIMO = 100;
    final int VOLUME_MINIMO = 0;
    int volumeAntesDoMudo = volume;
    
    public void mudarCanal(int novoCanal){
        if(novoCanal > 0){
        canal = novoCanal;
        } else {
            System.out.println("Canal inválido. O canal deve ser maior que 0.");
        }
    }
    
    public void avancarCanal(){
        canal++;
    }
    
    public void voltarCanal(){
        if(canal > 1){
        canal--;
        } else {
            System.out.println("Já está no canal mínimo.");
        }
    }
    
    public void aumentarVolume(){
        if(volume < VOLUME_MAXIMO){
            volume++;
            if(mudo) {
                mudo = false;
                volume = volumeAntesDoMudo;
                System.out.println("Mudo destivado");
            }
        } else {
            System.out.println("Volume já está no máximo");
        }    

    }
    
    public void diminuirVolume(){
        if(volume > VOLUME_MINIMO) {
            volume--;
        } else {
            System.out.println("Volume já está no mínimo.");
        }   
    }

    public void ativarMudo(){
        if(!mudo){
            mudo = true;
            volumeAntesDoMudo = volume;
            volume = 0;
            System.out.println("Mudo ativado.");
        } else {
            mudo = false;
            volume = volumeAntesDoMudo;
            System.out.println("Mudo desativado");
        }
    }    
    public void ligar(){
        ligada = true;
        System.out.println("TV ligada.");

    }
    public void desligar(){
        ligada = false;
        System.out.println("TV desligada.");
    }
    public void exibirStatus(){
        System.out.println("TV Ligada?" + ligada);
        System.out.println("canal atual:  " + canal);
        System.out.println("Volume atual: " + volume);
        System.out.println("Mudo ativado? " + mudo);

    }
}

