package at.eyu.oop.Geometric;

// Klasse für einen Kreis, erbt von GeometricFigure
public class Circle extends GeometricFigure {
    // Radius des Kreises
    private double radius;

    // Konstruktor für die Initialisierung von Name und Radius
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Implementierung der abstrakten Methode zur Berechnung des Flächeninhalts
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
