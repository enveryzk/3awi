package at.eyu.oop.Geometric;

// Hauptklasse für die Anwendung
public class Main {
    public static void main(String[] args) {
        // Erstellen von Instanzen der geometrischen Figuren
        Circle circle1 = new Circle("Circle1", 5);
        Square square1 = new Square("Square1", 4);
        Cube cube1 = new Cube("Cube1", 3);

        // Ausgabe der Flächeninhalte
        System.out.println(circle1.name + " Flächeninhalt: " + circle1.getArea());
        System.out.println(square1.name + " Flächeninhalt: " + square1.getArea());
        System.out.println(cube1.name + " Flächeninhalt: " + cube1.getArea());
    }
}
