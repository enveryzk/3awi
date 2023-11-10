package at.eyu.basic.oop.bsp;

public class Fahrrad {
    private int iMarke =0;
    private String sFarbe ="Keine Farbe";

    private int iRahmengroesse = 0;

    public int getiMarke() {
        return iMarke;
    }

    public void setiMarke(int iMarke) {
        this.iMarke = iMarke;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public int getiRahmengroesse() {
        return iRahmengroesse;
    }

    public void setiRahmengroesse(int iRahmengroesse) {
        this.iRahmengroesse = iRahmengroesse;
    }
}