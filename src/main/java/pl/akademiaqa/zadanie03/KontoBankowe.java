package pl.akademiaqa.zadanie03;

public class KontoBankowe {
    private String wlasciciel;
    private double saldo;

    public KontoBankowe(String wlasciciel) {
        this.wlasciciel = wlasciciel;
        this.saldo = 0;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public double getSaldo() {
        return saldo;
    }

    public void wplac(double kwota) {
        if (kwota > 0) {
            saldo = saldo + kwota;
            System.out.println("> Wpłata " + kwota + " \u2192 " + " saldo: " + saldo + " zł");
        }
    }

    public void wyplac(double kwota) {
        if (kwota > 0 && saldo >= kwota) {
            saldo = saldo - kwota;
            System.out.println("> Wypłata " + kwota + " \u2192 " + " saldo: " + saldo + " zł");
        } else {
            System.out.println("! Brak środków! Chcesz wypłacić " + kwota + ", masz " + saldo + " zł");
        }
    }

    public String toString() {
        return "> Konto: " + wlasciciel + " | saldo: " + saldo + " zł";
    }

}
