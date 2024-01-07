package at.eyu.oop.Rechner;

public class Wurzel extends BasicRechnung{

    public double wurzel(double zahl){
        if (zahl >= 0){
            return Math.sqrt(zahl);
        }else {
            System.out.println("Die Wurzel der negativen Zahl kann nicht gezogen werden");
            return 0.0;
        }
    }
}
