package junior.oop;

class Student {
    // Private attributes
    private final String name;
    private final int age;
    private final double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return gpa;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student("John", 20, 3.5);

        // Retrieve and display student information
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGPA());
    }
}
