public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Harry Potter", "Rowling", 300, true);
        Ksiazka k2 = new Ksiazka("Wiedzmin", "Sapkowski", 400, true);
        Ksiazka k3 = new Ksiazka("Hobbit", "Tolkien", 250, true);

        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 1);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 2);

        Biblioteka biblioteka = new Biblioteka(10);
        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);

        System.out.println("Dostepne ksiazki na poczatku:");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\nWypozyczenie ksiazki Harry Potter przez Jana:");
        biblioteka.wypozyczKsiazke("Harry Potter", c1);

        System.out.println("\nDane czytelnika po wypozyczeniu:");
        c1.wypiszDane();

        System.out.println("\nDostepne ksiazki po wypozyczeniu:");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\nZwrot ksiazki Harry Potter przez Jana:");
        biblioteka.zwrocKsiazke("Harry Potter", c1);

        System.out.println("\nDane czytelnika po zwrocie:");
        c1.wypiszDane();

        System.out.println("\nDostepne ksiazki po zwrocie:");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\nLiczba dostepnych ksiazek: " + biblioteka.policzDostepneKsiazki());
    }
}