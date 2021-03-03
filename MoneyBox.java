package Ukoly;

public class MoneyBox {

    private String owner;
    private int jedna;
    private int dve;

    //constructor
    public MoneyBox(String majitel){
        this.owner = majitel;
    }

    public MoneyBox(String majitel, int jedna, int dve){
        this.owner = majitel;
        this.jedna = jedna;
        this.dve = dve;
    }

    public int getSum(){
        return jedna + (dve*2);
    }

    //setter
    public void setOwner(String majitel){
        this.owner = majitel;
    }

    public void setJedna(int jedna) {
        this.jedna = jedna;
    }

    public void setDve(int dve) {
        this.dve = dve;
    }

    //getter
    public int getJedna() {
        return jedna;
    }

    public int getDve() {
        return dve;
    }

    public void addOne(){
        jedna += 1;
    }

    public void addOnes(int pocet){
        jedna += pocet;
    }

    public void addTwo(){
        dve += 1;
    }

    public void addMoney(int jedna, int dve){
        this.jedna += jedna;
        this.dve += dve;
    }

    public void takeMoney(){
        jedna = 0;
        dve = 0;
    }

    public String toString(){
        return owner+" má v pokladničce "+getSum()+" - "+jedna+"x1Kč, "+dve+"x2Kč.";
    }

    public boolean isEnough(int cena){
        if (getSum() >= cena){
            return true;
        } else return false;
    }

    public static void main(String[] args) {

    }
}
