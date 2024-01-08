package at.eyu.oop.Geometric;

// Konkrete Klasse für ein Viereck, erbt von GeometricFigure
public class Quadrat extends GeometricFigure {
    // Seitenlängen des Vierecks
    private double side1;
    private double side2;

    // Konstruktor für die Initialisierung von Name und Seitenlängen
    public Quadrat(String name, double side1, double side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    // Getter für die Seitenlängen
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    // Setter für die Seitenlängen
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    // Weitere spezifische Methoden für Quadrat können hier hinzugefügt werden

    // Konkrete Implementierung der abstrakten Methode aus der Basisklasse
    @Override
    public double getArea() {
        return side1 * side2;
    }
}
