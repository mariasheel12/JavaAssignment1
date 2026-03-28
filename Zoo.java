import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();

        System.out.print("Enter animal color: ");
        String color = scanner.nextLine();

        System.out.print("Enter animal age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Enter favorite food: ");
        String favFood = scanner.nextLine();

        // Create Animal object
        Animal animal = new Animal(name, color, age, favFood);

        // Print details
        animal.printDetails();

        scanner.close();
    }
}