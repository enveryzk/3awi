package at.eyu.oop.cars;

public class Hersteller {
    private String name;
    private String herkunftsland;
    private int rabatt;

    //Constructor
    public Hersteller(String name, String herkunftsland, int rabatt) {
        this.name = name;
        this.herkunftsland = herkunftsland;
        this.rabatt = rabatt;
    }

    //Methode zum Rabatt aufrufen
    public int getrabat(){
        return rabatt;
    }
}
