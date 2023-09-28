package junior.oop;

class Animal {
    // Attributes
    private final String name;
    private final int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal {
    // Additional attribute
    private final String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Get breed attribute
    public String getBreed() {
        return breed;
    }

    // Override makeSound() method
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog("Pupa", 2, "Labrador");

        // Display the dog's information
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());

        // Make the dog bark
        dog.makeSound();
    }
}
