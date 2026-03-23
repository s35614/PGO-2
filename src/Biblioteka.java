public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length ){
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Biblioteka jest pelna");
        }
    }
    public void wypiszDostepneKsiazki(){
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i] != null) {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    public Ksiazka znajdzKsiazkePoTytule(String tytul){
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
            if (ksiazki[i] != null) {
                count++;
            }
        }
        return count;
    }


}
