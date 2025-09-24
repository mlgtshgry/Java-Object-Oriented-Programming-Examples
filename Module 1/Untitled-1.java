// Parent class (superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (subclass)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog();

        // Call method from the parent class
        myDog.eat();   // inherited from Animal

        // Call method from the Dog class
        myDog.bark();
    }
}
