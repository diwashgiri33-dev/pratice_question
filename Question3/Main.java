package Question3;

public class Main {
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age must be 18 or above.");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
