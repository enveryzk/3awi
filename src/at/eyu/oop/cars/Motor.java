package at.eyu.oop.cars;

public class Motor {
    private String typ;
    private int Leistung;

    //Constructor
    public Motor(String typ, int leistung) {
        this.typ = typ;
        Leistung = leistung;
    }

    public String getTyp(){
        return typ;
    }

    public int getLeistung(){
        return Leistung;
    }
}
