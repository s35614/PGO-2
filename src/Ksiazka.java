public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbastron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor,
                   int liczbastron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbastron = liczbastron;
        this.dostepna = dostepna;

    }
    public void wypiszInfo(){
        System.out.println("Tytul: " + tytul + ", Autor: " +
                autor + ", Liczba stron: " + liczbastron + ", Dostepna: " + dostepna);
    }
    public void wypozycz(){
        if (dostepna){
            dostepna = false;
            System.out.println("Ksiazka wypozyczona");
        } else {
            System.out.println("Ksiazka niedostepna");
        }

    }
    public void zwroc() {
        dostepna = true;
        System.out.println("Ksiazka zwrocona");
    }

    public String getTytul() {
        return tytul;
    }
}
