package at.eyu.oop.Handy;

// Klasse für den Benutzer mit Login-Informationen
public class User {
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Überprüfung der Anmeldeinformationen
    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
}

