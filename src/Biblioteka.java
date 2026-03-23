public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;
    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Biblioteka jest pelna.");
        }
    }
    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i] != null && ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i] != null && ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }
    public int policzDostepneKsiazki() {
        int count = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i] != null && ksiazki[i].isDostepna()) {
                count++;
            }
        }
        return count;
    }
    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);
        if (ksiazka != null && ksiazka.isDostepna()) {
            ksiazka.wypozycz();
            czytelnik.zwiekszLiczbeWypozyczen();
            System.out.println("Czytelnik wypozyczyl ksiazke: " + tytul);
        } else {
            System.out.println("Nie mozna wypozyczyc ksiazki: " + tytul);
        }
    }
    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);
        if (ksiazka != null && !ksiazka.isDostepna()) {
            ksiazka.zwroc();
            czytelnik.zmniejszLiczbeWypozyczen();
            System.out.println("Czytelnik zwrocil ksiazke: " + tytul);
        } else {
            System.out.println("Nie mozna zwrocic ksiazki: " + tytul);
        }
    }
}