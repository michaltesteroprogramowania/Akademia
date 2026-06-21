package pl.akademiaqa.zadanie05;

public class Produkt {
    private String nazwa;
    private double cena;
    private int ilosc;

    public Produkt(String nazwa, double cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public double wartosc() {
       return cena * ilosc;
    }

    public String toString() {
        return "> " + nazwa + " | " + String.format("%.2f", cena) + " zł x " + ilosc + " = " + String.format("%.2f", wartosc()) + " zł";
    }

}
