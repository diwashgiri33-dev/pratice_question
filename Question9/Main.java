package Question9;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> errors = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File("server.log"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                if (line.contains("ERROR")) {
                    errors.add(line);
                }
            }

            for (String e : errors) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }
}