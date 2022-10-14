public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // criar os métodos que manipulam esses estados

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal() {
        //canal = canal + 1
        canal++;
        System.out.println("Canal " + canal);
    }
    public void diminuirCanal() {
        canal--;
        System.out.println("Canal " + canal);
    }
    public void aumentarVolume(){
        //volume = volume + 1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
