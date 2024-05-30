public class Televizyon {
    private int kanal;
    public Televizyon(){
        kanal = 0;
    }
    public void kanalDegistir(int k){
        kanal = k;
    }
    public void birSonrakiKanal(){
        kanal++;
    }
    public void birOncekiKanal(){
        kanal--;
    }
    public int gecerliKanal(){
        return kanal;
    }
}
