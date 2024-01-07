package at.eyu.oop.Geometric;

// Klasse für ein Quadrat, erbt von Quadrilateral
public class Square extends Quadrat {
    // Konstruktor für die Initialisierung von Name und Seitenlänge
    public Square(String name, double side) {
        super(name, side, side);
    }

    // Implementierung der abstrakten Methode zur Berechnung des Flächeninhalts

    public double getArea() {
        return side1 * side2;
    }
}
