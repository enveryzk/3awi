package at.eyu.oop.Geometric;

// Abstrakte Klasse für ein Viereck, erbt von GeometricFigure
public abstract class Quadrat extends GeometricFigure {
    // Seitenlängen des Vierecks
    protected double side1;
    protected double side2;

    // Konstruktor für die Initialisierung von Name und Seitenlängen
    public Quadrat(String name, double side1, double side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }
}
