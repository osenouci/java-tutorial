public class Main {

    public static void main(String[] args) {

        // Defining the class as abstract will prevent us from creating objects using the class.
        // Animal animal = new Animal("Fish");
        // animal.sayName();

        Cat myCat = new Cat("Kat");
        myCat.sayName();

        Cat myDog = new Cat("Zog");
        myDog.sayName();

        Animal lion = new Cat("Simba");
        lion.sayName();

        if(myCat instanceof Animal) {
            System.out.println("myCat is instance of the class Animal");
        }

        if(myCat instanceof Cat) {
            System.out.println("Cat is an instance of the class Cat");
        }

        WildCat wildCat = new WildCat();
        if(wildCat instanceof Animal) {
            System.out.println("wildCat is instance of the class Animal");
        }

        if(wildCat instanceof Cat) {
            System.out.println("wildCat is an instance of the class Cat");
        }

        if(wildCat instanceof WildCat) {
            System.out.println("Cat is an instance of the class WildCat");
        }

        Animal streetCat = new WildCat();
        ((Cat) streetCat).SayMeo();

    }
}
