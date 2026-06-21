package pl.akademiaqa.zadanie02;

public class Prostokat {
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double obliczPole() {
        return a * b;
    }

    public double obliczObwod() {
        return 2 * (a + b);
    }

    public boolean czyKwadrat() {
         if (a == b) {
            return true;
         }
         return false;
    }

    public String toString() {
        return "> " + a + " x " + b + " | pole: " + obliczPole() + " | obwod: " + obliczObwod() + " | kwadrat: " + (czyKwadrat() ? "TAK" : "NIE");
    }
}
