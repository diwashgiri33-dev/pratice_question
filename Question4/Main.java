package Question4;

import java.io.*;
public class Main {
    public static void main(String[] args) {

        double[] sales = {1000, 1200, 900, 1500, 1100, 1300, 1400};

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("weekly_sales.txt"));

            for (double s : sales) {
                bw.write(String.valueOf(s));
                bw.newLine();
            }

            bw.close();
            System.out.println("File saved.");
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}
