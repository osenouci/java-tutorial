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

        Main.displayHeader("Static keyword");

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


        // If conditions
        Main.displayHeader("If conditions");
        int myNum = 1;
        if(myNum == 1) {
            System.out.println("It's a one");
        } else if (myNum == 2) {
            System.out.println("It's a two");
        } else {
            System.out.println("It's something else");
        }

        // Switch statement
        Main.displayHeader("Switch statement");
        switch(myNum) {
            case 1:
                System.out.println("It's a one");
                break;
            case 2:
                System.out.println("It's a two");
                break;
            default:
                System.out.println("It's something else");
        }

        // Define an array of strings.
        // An array is a data structure of fixed size.
        // It cannot be expanded. But the values can be modified
        String[] animalSet1 = new String[] {"Donkey", "Monkey", "Gold Fish"};
        animalSet1[2] = "Dog";

        // Since we have an array of fixed size 3. Trying to access a none existing array index will result in
        // an exception
        try {
            animalSet1[4] = "Hello";
        } catch(Exception e) {
            System.out.println(e);
        }

        String[] animalSet2 = {"Donkey", "Monkey", "Gold Fish"};
        animalSet2[1] = "Horse";

        String[] animalSet3 = new String[3];
        animalSet3[0] = "Donkey";
        animalSet3[1] = "Monkey";
        animalSet3[2] = "Gold Fish";

        Main.displayHeader("For loop");
        // Iterating over an array in java
        for(int i = 0; i < animalSet3.length; i = i + 2) {
            System.out.println(animalSet3[i]);
        }

        // While loop
        Main.displayHeader("While loop");
        int i = 0;
        while(i < animalSet3.length) {
            System.out.println(animalSet3[i]);
            i++;
        }

        // For each loop
        Main.displayHeader("For each loop");
        for(String value : animalSet2) {
            System.out.println(value);
        }

        // Exercise: Find the `Monkey` in animalSet3
        for (String value: animalSet3) {
            if (value.equals("Monkey")){
                System.out.println("Found the value:" + value);
            }
        }

        // Test the equals
        Main.displayHeader("Compare string objects");
        String str1 = new String("AB");
        String str2 = new String("AB");
        System.out.println("AB" == "AB");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }

    public static void displayHeader(String header) {
        System.out.println("#################################");
        System.out.println("\t\t" + header);
        System.out.println("#################################");
    }
}
