package at.eyu.oop.Handy;

// Klasse für die Kamera
public class Camera {
    public PhotoFile takePhoto() {
        // Logik zum Aufnehmen eines Fotos
        // Hier kann die Dateigröße je nach Kamerareolution berücksichtigt werden
        return new PhotoFile("photo" + System.currentTimeMillis() + ".jpg");
    }
}
