package Question15;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        // Store employees
        ArrayList<Employee> staff =
                new ArrayList<>();

        staff.add(
                new FullTime(
                        "John", 50000));

        staff.add(
                new Contractor(
                        "Ram", 100, 200));

        try (
                BufferedWriter bw =
                        new BufferedWriter(
                                new FileWriter(
                                        "payroll_report.txt"))
        ) {

            // Write payroll data
            for (Employee e : staff) {

                bw.write(
                        e.name + " : "
                                + e.calculatePay());

                bw.newLine();
            }

            System.out.println(
                    "Payroll report generated");

        } catch (IOException e) {

            System.out.println(e);
        }
    }
}