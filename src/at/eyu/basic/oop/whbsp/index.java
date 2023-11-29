package at.eyu.basic.oop.whbsp;

public class index {

    public static void main(String[] args) {

        // Assuming you have a constructor in the car class
        car c1 = new car(0.5, 60.0, 8.0); // Example values for tankstand, tankvolumen, and verbrauch

        // Assuming you have methods like getBrand, getColor, getSerialnumber in the car class
        c1.setBrand("hu");
        c1.setColor("bhbh");
        c1.setSerialnumber("1234");

        System.out.println("Brand: " + c1.getBrand());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Serial Number: " + c1.getSerialnumber());

        /*
        // Uncomment this section if you want to create and use a second car object
        car c2 = new car("Mercedes", "blue", "02");
        System.out.println(c2.getBrand());
        System.out.println(c2.getColor());
        c2.Turboboost();
        c2.breakMethod();
        c2.honk(3);
        */
    }
}
