package at.eyu.basic.oop.bsp;

import java.util.ArrayList;

public class Auto {
    private int iLeistung =0;
    private String sFarbe ="Keine Farbe";

    private Fahrrad kofferraumfahrrad;

    private ArrayList<Getraenkekiste> kofferraumGetraenkekiste = new ArrayList<Getraenkekiste>();


    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
    }

    public Fahrrad getKofferraumfahrrad() {
        return kofferraumfahrrad;
    }



    public void setKofferraumfahrrad(Fahrrad kofferraumfahrrad) {
        this.kofferraumfahrrad = kofferraumfahrrad;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public ArrayList<Getraenkekiste> getKofferraumGetraenkekiste() {
        return kofferraumGetraenkekiste;
    }

    public void setKofferraumGetraenkekiste(Getraenkekiste kofferraumGetraenkekiste) {
        this.kofferraumGetraenkekiste.add(kofferraumGetraenkekiste);
    }
}
