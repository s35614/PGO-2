public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;
    public Czytelnik(String imie, String nazwisko, int numerKarty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = 0;
    }
    public void wypiszDane(){
        System.out.println("Imie: " + imie + ", Nazwwisko: " + nazwisko +
                ", Numer karty: " + numerKarty + ", LiczbaWypozyczen: " + liczbaWypozyczen);
    }
    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
    }
    public void zmniejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0){
            liczbaWypozyczen--;
        }
    }
}
