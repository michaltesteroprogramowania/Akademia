package pl.akademiaqa.zadanie05;

public class Main {
    public static void main(String[] args) {
        Produkt[] produkty = {
                new Produkt("Laptop", 3499.99, 5),
                new Produkt("Mysz", 89.90, 20),
                new Produkt("Klawiatura", 149.99, 15),
                new Produkt("Monitor", 899.00, 8),
        };

        double wartoscMagazynu = 0;

        for (int i = 0; i < produkty.length; i++) {
            System.out.println(produkty[i]);
            wartoscMagazynu += produkty[i].wartosc();

        }
        System.out.println();
        System.out.println("---");
        System.out.println();
        System.out.println("> Wartość magazynu: " + String.format("%.2f", wartoscMagazynu) + " zł");

        Produkt max = produkty[0];

        for (int i = 1; i < produkty.length; i++) {
            if (produkty[i].getCena() > max.getCena()) {
                max = produkty[i];
            }
        }
        System.out.print("> Najdroższy: " + max.getNazwa() + " (" + String.format("%.2f", max.getCena()) + " zł)");
    }
}
