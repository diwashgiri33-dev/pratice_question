package Question6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> guests = new ArrayList<>();

        guests.add("Diwash");
        guests.add("Denish");
        guests.add("Diwash");
        guests.add("Gita");

        for (int i = 0; i < guests.size(); i++) {
            for (int j = i + 1; j < guests.size(); j++) {
                if (guests.get(i).equals(guests.get(j))) {
                    System.out.println("Duplicate: " + guests.get(i));
                }
            }
        }
    }
}