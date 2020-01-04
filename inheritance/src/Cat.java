public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("No name provided");
    }

    public void SayMeo() {
        System.out.println("The nice cat says meo");
    }
}

/*
    Cat cat1 = new Cat("Coka"); // Here will call the constructor with a parameter Cat::Cat(String name)
    Cat cat2 = new Cat(); // Here we will call the constructor without arguments Cat::Cat()
*/