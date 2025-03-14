public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
    
    public void mundarcanal(int novoCanal){
        canal = novoCanal;
    }
    
    public void avancarCanal(){
        canal++;
    }
    
    public void voltarCanal(){
        canal--;
    }
    
    public void aumentarVolume(){
        volume++;
    }
    
    public void diminiuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;

    }
    public void desligar(){
        ligada = false;
    }
}
