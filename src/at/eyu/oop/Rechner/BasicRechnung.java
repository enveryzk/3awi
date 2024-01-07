package at.eyu.oop.Rechner;

public class BasicRechnung {
    public double plus(double a, double b){
        return a + b;
    }

    public double minus(double a, double b){
        return a - b;
    }

    public double divi(double a, double b){
        if (b <= 0){
            System.out.println("Division durch Null ist nicht erlaubt.");
            return 0.0;
        } else {
            return a / b;
        }
    }

    public double mal(double a, double b){
        return a*b;
    }
}
