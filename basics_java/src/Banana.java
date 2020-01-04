public class Banana {

    // Here we have properties

    // private is access keyword, static is a keyword, int is property type meaning integer
    // count is the property name
    public static int count = 0;

    // this property is NOT static
    private String color;

    // Constructor
    // In java the constructor uses the same name as the class
    // Take as many params as defined.
    public Banana(String color) {
        this.color = color;
    }

    // This is a public method that returns a string as the indicated by the line below.
    // It cannot return another data type.
    public String getBananaColor() {
        return this.color;
    }


    public static void displayTotalBananaCount() {
        System.out.println("Total banana count: " + Banana.count);
    }

}
