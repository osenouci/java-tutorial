/**
 * public means that the class can be accessible form the outside.
 */
public class Main {


    /**
     * public: Access control keyword [public, protected, private]
     * Static: Static vs. regular method and variables
     * void: Data type. Means nothing. Here the return type is nothing since the method does not return anything
     * main: is the name of the function/method. Here main access point is a static function called main()
     * String[] args -> Is the list of argument we pass to the function using the command line.
     */
    public static void main(String[] args) {
        System.out.println("Helloooooo");

        // The new keyword is used to instantiate a new object of a given class
        Banana greenBanana = new Banana("Green banana");
        Banana yellowBanana = new Banana("Yellow banana");
        Banana brownBanana = new Banana("Brown banana");

        // Static methods and properties are shared between the instances
        // We can set a static property's value either using the class name or an instance of that class
        greenBanana.count = 2;
        yellowBanana.count = 2;
        Banana.count = 2;
        brownBanana.count = 2;


        System.out.println(yellowBanana.getBananaColor());

        // Static methods can also be called either using the class name or one of its instances.
        Banana.displayTotalBananaCount();
        greenBanana.displayTotalBananaCount();
        brownBanana.displayTotalBananaCount();
        yellowBanana.displayTotalBananaCount();
    }
}
