package Question14;

import java.io.*;

public class Main {

    static void readConfig() throws FileNotFoundException {
        File file = new File("config.txt");

        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        System.out.println("Config Loaded");
    }

    static void createDefaultConfig() {
        try {
            FileWriter fw = new FileWriter("config.txt");
            fw.write("Default Settings");
            fw.close();

            System.out.println("Default Config Created");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {

        try {
            readConfig();
        } catch (FileNotFoundException e) {
            createDefaultConfig();
        }
    }
}
