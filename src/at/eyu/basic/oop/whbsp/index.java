package at.eyu.basic.oop.whbsp;

public class index {

    public static void main(String[] args) {

        car c1 = new car();
        c1.brand="Audi";
        c1.color="black";
        c1.fuelComsumption = 1;
        c1.serialnumber = "01";

        car c2 = new car();
        c2.brand="Mercedes";
        c2.color="blue";
        c2.fuelComsumption = 2;
        c2.serialnumber = "02";

        System.out.println(c1.brand);
        System.out.println(c1.color);

        System.out.println(c2.brand);
        System.out.println(c2.color);

        c2.Turboboost();

        c1.breakMethod();

        c2.honk(3);

    }
}
