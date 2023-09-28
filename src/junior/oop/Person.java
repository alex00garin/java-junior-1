package junior.oop;

/**
 * @param name Attributes
 */
public record Person(String name, int age) {
    // Constructor

    // Override toString method to display person's information
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }


    public static void main(String[] args) {
        // Create an object of the Person class
        Person person = new Person("John", 25);

        // Use the getter methods to retrieve and print the attributes
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
    }
}
