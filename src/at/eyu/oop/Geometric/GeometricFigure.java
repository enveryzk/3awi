package at.eyu.oop.Geometric;

// Abstrakte Klasse, die als Basisklasse für geometrische Figuren dient
public abstract class GeometricFigure {
    // Gemeinsame Eigenschaft für alle geometrischen Figuren
    protected String name;

    // Konstruktor, der den Namen der geometrischen Figur setzt
    public GeometricFigure(String name) {
        this.name = name;
    }

    // Abstrakte Methode für die Berechnung des Flächeninhalts
    public abstract double getArea();

    // Methode zum Abrufen des Namens der geometrischen Figur
    public String getName() {
        return name;
    }
}
