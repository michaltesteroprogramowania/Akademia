package pl.akademiaqa.zadanie03;

public class Main {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe1 = new KontoBankowe("Jan Kowalski");

        System.out.println(kontoBankowe1);

        kontoBankowe1.wplac(1000);

        kontoBankowe1.wyplac(400);

        kontoBankowe1.wyplac(800);

        System.out.println(kontoBankowe1);
    }
}
