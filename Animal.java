public class Animal {

    // Fields
    private String name;
    private String color;
    private int age;
    private String favFood;

    // Constructor
    public Animal(String name, String color, int age, String favFood) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.favFood = favFood;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getFavFood() {
        return favFood;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Animal Details:");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Favorite Food: " + favFood);
    }
}