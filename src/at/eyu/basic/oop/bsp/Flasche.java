package at.eyu.basic.oop.bsp;

public class Flasche {

    private String hersteller;

    private int Volumen;

    private String gefuelltmit;

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getVolumen() {
        return Volumen;
    }

    public void setVolumen(int volumen) {
        Volumen = volumen;
    }

    public String getGefuelltmit() {
        return gefuelltmit;
    }

    public Flasche(String hersteller, int volumen, String gefuelltmit) {
        this.hersteller = hersteller;
        this.Volumen = volumen;
        this.gefuelltmit = gefuelltmit;
    }

    public void setGefuelltmit(String gefuelltmit) {
        this.gefuelltmit = gefuelltmit;
    }
}