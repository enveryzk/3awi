package at.eyu.oop.Handy;

// Klasse für die SIM-Karte
public class SimCard {
    private final String id;
    private final String phoneNumber;

    public SimCard(String id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
