package pl.akademiaqa.zadanie01;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int strony;
    private boolean przeczytana;

    public Ksiazka(String tytul, String autor, int strony, boolean przeczytana) {
        this.tytul = tytul;
        this.autor = autor;
        this.strony = strony;
        this.przeczytana = przeczytana;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getStrony() {
        return strony;
    }

    public void setStrony(int strony) {
        this.strony = strony;
    }

    public boolean isPrzeczytana() {
        return przeczytana;
    }

    public void setPrzeczytana(boolean przeczytana) {
        this.przeczytana = przeczytana;
    }

    public String toString() {
        return "Książka {tytul='" + tytul + "', autor='" + autor + "', strony=" + strony + ", przeczytana=" + przeczytana + "}";
    }
}
