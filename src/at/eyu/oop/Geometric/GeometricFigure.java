package at.eyu.oop.Geometric;

// Klasse, die als Basisklasse für geometrische Figuren dient
public class GeometricFigure {
    // Gemeinsame Eigenschaft für alle geometrischen Figuren
    protected String name;

    // Konstruktor, der den Namen der geometrischen Figur setzt
    public GeometricFigure(String name) {
        this.name = name;
    }

    // Methode für die Berechnung des Flächeninhalts (kann konkrete Implementierung haben)
    public double getArea() {
        // Hier könnte auch eine konkrete Implementierung stehen, je nach Bedarf
        return 0.0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
