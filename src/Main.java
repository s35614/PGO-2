public class Main {
    public static void main(String[] args){
        Ksiazka k1 = new Ksiazka("Harry Potter", "Rowling",
                300, true);
        Ksiazka k2 = new Ksiazka("Wiedzmin", "Sapkowski",
                400, true);
        Ksiazka k3 = new Ksiazka("Hobbit", "Tolkien",
                250, true);

        k1.wypiszInfo();
        k1.wypozycz();
        k1.wypiszInfo();
        k1.zwroc();

        Czytelnik c1  = new Czytelnik("Jan", "Kowalski", 1);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 2);
         c1.wypiszDane();
         c1.zwiekszLiczbeWypozyczen();
         c1.wypiszDane();

         c2.wypiszDane();
    }
}