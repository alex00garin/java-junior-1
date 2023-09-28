package junior.oop;

public class PersonDemo {
    // Attributes
    private final String name;
    private final int age;

    // Constructor
    public PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override toString method to display person's information
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }


    public static void main(String[] args) {
        // Create an object of the Person class
        PersonDemo person = new PersonDemo("John", 25);

        // Use the getter methods to retrieve and print the attributes
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Print out the person's information using the overridden toString() method
        System.out.println(person);
    }
}
