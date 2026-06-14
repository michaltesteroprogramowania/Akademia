package pl.akademiaqa.zadanie04;

public class Stoper {
    private int sekundy;

    public int getSekundy() {
        return sekundy;
    }

    public Stoper() {
        this.sekundy = 0;
    }

    public void dodaj(int liczbaSekund) {
        if (liczbaSekund > 0) {
            sekundy = sekundy + liczbaSekund;
            System.out.println("> Dodano " + liczbaSekund + "s \u2192 " + sformatuj());
        } else {
            System.out.println("! Nie można dodać ujemnej wartości!");
        }
    }

    public void resetuj() {
        sekundy = 0;
        System.out.println("> Reset " + "\u2192 " + sformatuj());
    }

    public String sformatuj() {
        int minuty = sekundy / 60;
        int pozostaleSekundy = sekundy % 60;

        return minuty + "min " + pozostaleSekundy + "s";
    }
    public String toString() {
        return "> Stoper: " + sformatuj();
    }
}

