package Question11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Bike());
        fleet.add(new Bus());

        // Polymorphism in action
        for (Vehicle v : fleet) {
            System.out.println(v.calculateFee());
        }
    }
}