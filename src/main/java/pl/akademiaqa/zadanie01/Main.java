package pl.akademiaqa.zadanie01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Odcienie przemocy", "Grzegorz Karwowski", 321, false);
        Ksiazka ksiazka2 = new Ksiazka("Książka o inwestowaniu", "Rafał Janik", 238, false);

        System.out.println(ksiazka1);
        System.out.println(ksiazka2);

        ksiazka1.setPrzeczytana(true);
        ksiazka2.setPrzeczytana(true);

        System.out.println(ksiazka1);
        System.out.println(ksiazka2);


    }
}
