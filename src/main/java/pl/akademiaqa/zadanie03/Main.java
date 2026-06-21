package pl.akademiaqa.zadanie03;

public class Main {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe("Jan Kowalski");

        System.out.println(kontoBankowe);

        kontoBankowe.wplac(1000);
        kontoBankowe.wyplac(400);
        kontoBankowe.wyplac(800);

        System.out.println(kontoBankowe);
    }
}
