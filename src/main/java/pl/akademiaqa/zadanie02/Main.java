package pl.akademiaqa.zadanie02;

public class Main {
    public static void main(String[] args) {
        Prostokat[] prostokaty = {
                new Prostokat(7, 5),
                new Prostokat(5, 5),
                new Prostokat(9, 7),
        };

        for (int i = 0; i < prostokaty.length; i++) {
            System.out.println(prostokaty[i]);
        }
    }
}