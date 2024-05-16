import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTyping = true;

        while (isTyping) {
            System.out.print("Enter a fruit name: ");
            String fruitName = scanner.next().toUpperCase();

            try {
                Fruit myFruit = Fruit.valueOf(fruitName);
                printFruitDetails(myFruit);
            } catch (IllegalArgumentException e) {
                System.out.println("Unknown fruit");
            }

            System.out.print("Do you want to continue? yes or no: ");
            String isEnd = scanner.next().toUpperCase();
            if (isEnd.equals("NO")) {
                isTyping = false;
            }
        }
        scanner.close();
    }

    static void printFruitDetails(Fruit fruit) {
        switch (fruit) {
            case APPLE:
                System.out.println("The color of APPLE is " + fruit.getColor() + " and it tastes " + fruit.getTaste());
                break;
            case BANANA:
                System.out.println("The color of BANANA is " + fruit.getColor() + " and it tastes " + fruit.getTaste());
                break;
            case ORANGE:
                System.out.println("The color of ORANGE is " + fruit.getColor() + " and it tastes " + fruit.getTaste());
                break;
            case GRAPH:
                System.out.println("The color of GRAPE is " + fruit.getColor() + " and it tastes " + fruit.getTaste());
                break;
            case LEMON:
                System.out.println("The color of LEMON is " + fruit.getColor() + " and it tastes " + fruit.getTaste());
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }
    }
}