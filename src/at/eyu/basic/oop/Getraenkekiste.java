package at.eyu.basic.oop;

public class Getraenkekiste {

    private int iAnzahl;

    private Flasche flasche;

    public Getraenkekiste(int iAnzahl, Flasche flasche) {
        this.iAnzahl = iAnzahl;
        this.flasche = flasche;
    }

    public int getiAnzahl() {
        return iAnzahl;
    }

    public void setiAnzahl(int iAnzahl) {
        this.iAnzahl = iAnzahl;
    }

    public Flasche getFlasche() {
        return flasche;
    }

    public void setFlasche(Flasche flasche) {
        this.flasche = flasche;
    }
}