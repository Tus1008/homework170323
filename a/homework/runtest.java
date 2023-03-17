package a.homework;

public class runtest {
    public static void main(String[] args){
        System.out.println("parent class mobaile");
        mobaile m = new mobaile();
        m.numbersofversion();
        m.speedofnetwork();
        m.price();

        System.out.println("child class keypad");
        keypad k = new keypad();
        k.numbersofversion();
        k.speedofnetwork();
        k.price();
        k.numbersofversion();

    }
}
