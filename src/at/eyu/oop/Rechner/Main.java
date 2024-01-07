package at.eyu.oop.Rechner;

public class Main {
    public static void main(String[] args) {

        BasicRechnung basicRechnung = new BasicRechnung();
        sin_cos sin_cos = new sin_cos();
        Wurzel wurzel = new Wurzel();

        double Ergebnisaddition = basicRechnung.plus(5,8);
        System.out.println("Addition: " + Ergebnisaddition);

        double Ergebnisdividieren = basicRechnung.divi(2,0);
        System.out.println("Divi: " + Ergebnisdividieren);

        double Ergebniswurzel = wurzel.wurzel(9);
        System.out.println("Wurzel: " + Ergebniswurzel);

        double Ergebniscos = sin_cos.cos(90);
        System.out.println("Cos: " + Ergebniscos);

        double Ergebnissin = sin_cos.sin(90);
        System.out.println("Sin: " + Ergebnissin);


    }
}
