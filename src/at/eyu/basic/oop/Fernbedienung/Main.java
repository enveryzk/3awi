package at.eyu.basic.oop.Fernbedienung;

class Batterie {
    //Ladestatus der Batterie
    private double status;

    //Constructor ladestatus auf 100%
    public Batterie(double status) {
        this.status = 100;
    }

    //Reduziert den Ladestatus um die Prozent
    public void schwacheum(double prozent) {
        this.status -= prozent;
        if (this.status <= 0){
            this.status = 0;
        }
    }

    public double getStatus() {
        return this.status;
    }
}
class Fernbedienung {
    //Zwei Batterien als Variablen
    private Batterie batterie1;
    private Batterie batterie2;

    //Constructor initialisiert beide Batterien
    public Fernbedienung(Batterie batterie1, Batterie batterie2) {
        this.batterie1 = new Batterie(100);
        this.batterie2 = new Batterie(100);
    }

    public Fernbedienung() {

    }


    //Einschalten
    public void turnon (){
        //Verringert den Ladestatus beider Batterien um 5%
        batterie1.schwacheum(5);
        batterie2.schwacheum(5);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnoff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public double getstatus(){
        double status1 = batterie1.getStatus();
        double status2 = batterie2.getStatus();
        return (status1 + status2)/2;
    }
}

public class Main{
    public static void main(String[] args) {
        //Fernbedienung erstellen
        Fernbedienung fernbedienung = new Fernbedienung(new Batterie(100), new Batterie(100));

        //Schalte ein

        fernbedienung.turnon();

        System.out.println("Aktueller Status: " + fernbedienung.getstatus());

        fernbedienung.turnoff();

        System.out.println("Aktueller Status: " + fernbedienung.getstatus());

        fernbedienung.turnon();

        System.out.println("Aktueller Status: " + fernbedienung.getstatus());


    }
}
