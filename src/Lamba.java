public class Lamba {
    private int lamba;
    public Lamba (){
        lamba = 0;
    }
    public void lambaAc(){
        System.out.println("Lamba Açıldı.");
        lamba = 1;
    }
    public void lambaKapa(){
        System.out.println("Lamba Kapatıldı.");
        lamba = 0;
    }
    public int lambaDegeri(){
        return lamba;
    }
}
