package pl.akademiaqa.zadanie04;

public class Main {
    public static void main(String[] args) {
        Stoper stoper = new Stoper();

        stoper.dodaj(45);
        stoper.dodaj(90);
        stoper.dodaj(-10);

        System.out.println(stoper);

        stoper.resetuj();
    }
}
