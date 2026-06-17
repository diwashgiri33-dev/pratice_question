package Question2;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(95);
        scores.add(70);
        scores.add(35);

        for (int score : scores) {
            if (score >= 90)
                System.out.println("Distinction");
            else if (score >= 50)
                System.out.println("Pass");
            else
                System.out.println("Fail");
        }
    }
}