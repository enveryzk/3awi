package at.eyu.oop.cars;

public class Auto {
    private String farbe;
    private int maxgeschwindigkeit;
    private double basispreis;
    private double basisverbrauch;
    private Hersteller hersteller;
    private Motor motor;
    private int gefahrenekilometer;

    //Constructor


    public Auto(String farbe, int maxgeschwindigkeit, double basispreis, double basisverbrauch, Hersteller hersteller, Motor motor, int gefahrenekilometer) {
        this.farbe = farbe;
        this.maxgeschwindigkeit = maxgeschwindigkeit;
        this.basispreis = basispreis;
        this.basisverbrauch = basisverbrauch;
        this.hersteller = hersteller;
        this.motor = motor;
        this.gefahrenekilometer = gefahrenekilometer;
    }

    public double getPreis(){
        double rabatt = hersteller.getrabat();
        return basispreis * (1 - rabatt/100);
    }

    public double getBasisverbrauch() {
        if (gefahrenekilometer <= 50000) {
            return basisverbrauch;
        }else {
            return basisverbrauch * 1.098;
        }
    }

    public void fahre(int kilometer){
        this.gefahrenekilometer += kilometer;
    }
}
