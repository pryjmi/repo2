package Ukoly;

public class MoneyBoxApp {
    public static void main(String[] args) {
        MoneyBox a = new MoneyBox("Alice", 3, 5);
        MoneyBox b = new MoneyBox("Bob");
        b.addOne();
        b.addOne();
        b.addTwo();
        b.addTwo();
        b.addTwo();
        b.addMoney(5, 10);
        System.out.println("Alice má "+a.getSum()+"Kč, Bob má "+b.getSum()+"Kč.");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.isEnough(39)?"Alice může":"Alice nemůže");
        System.out.println(b.isEnough(39)?"Bob může":"Bob nemůže");
        System.out.println(a.getSum()>b.getSum()?"Alice má víc":a.getSum()==b.getSum()?"Oba mají stejně":"Bob má víc");
        a.addMoney(b.getJedna(), b.getDve());
        b.setJedna(0); b.setDve(0);
        System.out.println(a.getSum());
        System.out.println(b.getSum());
    }
}
