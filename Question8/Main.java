package Question8;

public class Main {
    public static void main(String[] args) {

        Electronics[] inventory = {
                new Electronics(1200),
                new Electronics(3000)
        };

        for (Electronics e : inventory) {
            e.applyDiscount(10);
        }
    }
}
