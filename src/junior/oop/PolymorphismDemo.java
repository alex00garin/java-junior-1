package junior.oop;

interface Shape {
    // Method to calculate the area of a shape
    double calculateArea();
}

class Circle implements Shape {
    // Attributes
    private final double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Implement calculateArea() for a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    // Attributes
    private final double width;
    private final double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Implement calculateArea() for a rectangle
    @Override
    public double calculateArea() {
        return height * width;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calculate and display the areas of the shapes
        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}

