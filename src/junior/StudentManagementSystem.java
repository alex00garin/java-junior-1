package junior;

import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Scanner;

class Student {
    private final String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    // Additional methods (if needed)
    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // This method is not used and can be removed
    public String getAge() {
        return null;
    }
}

class Course {
    private String courseName;
    private int maxStudents;
    private List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.enrolledStudents = new ArrayList<>();
    }

    // Methods to enroll students, display enrolled students, and check if the course is full
    public void enrollStudent(Student student) {
        if (enrolledStudents.size() < maxStudents) {
            enrolledStudents.add(student);
        }
    }

    // Additional methods (if needed)
    public String getCourseName() {
        return courseName;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

class StudentManagementSystem {
    private List<Student> students;
    private List<Course> courses;
    private String dataFile = "student_data.txt"; // File to store data

    // Constructor to initialize lists and read data from the file (if available)
    public StudentManagementSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();

        // Read data from the file if available
        try {
            File file = new File(dataFile);
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    // Parse the line and create students and courses objects
                    // Add them to the respective lists
                }

                bufferedReader.close();
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to add a new student
    public void addStudent(String name, int age, double gpa) {
        Student student = new Student(name, age, gpa);
        students.add(student);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
            }
        }
    }

    // Method to enroll a student in a course
    public void enrollStudent(String name, String courseName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                for (int j = 0; j < courses.size(); j++) {
                    if (courses.get(j).getCourseName().equals(courseName)) {
                        courses.get(j).enrollStudent(students.get(i));
                    }
                }
            }
        }
    }

    // Method to display all students
    public void displayAllStudents() {
        System.out.println("List of all students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", GPA: " + student.getGPA());
        }
    }

    // Method to display all courses
    public void displayAllCourses() {
        System.out.println("List of all courses:");
        for (Course course : courses) {
            System.out.println("Course Name: " + course.getCourseName() + ", Max Students: " + course.getMaxStudents());
        }
    }

    // Method to display students enrolled in a specific course
    public void displayStudentsByCourse(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                List<Student> enrolledStudents = course.getEnrolledStudents();
                System.out.println("Students enrolled in " + courseName + ":");
                for (Student student : enrolledStudents) {
                    System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", GPA: " + student.getGPA());
                }
            }
        }
    }

    // Method to save data to the file
    public void saveData() {
        try (FileWriter fileWriter = new FileWriter(dataFile);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            // Write data to the file
            for (Student student : students) {
                bufferedWriter.write(student.getName() + "," + student.getAge() + "," + student.getGPA() + "\n");
            }
            for (Course course : courses) {
                bufferedWriter.write(course.getCourseName() + "," + course.getMaxStudents() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Additional methods (if needed)
    public List<Student> getStudents() {
        return students;
    }

    public void addCourse(String courseName, int maxStudents) {
        Course course = new Course(courseName, maxStudents);
        courses.add(course);
    }

    public void removeCourse(String courseNameToRemove) {
        courses.removeIf(course -> course.getCourseName().equals(courseNameToRemove));
    }
}

class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        // Implement a text-based user interface here
        System.out.println("Welcome to the Student Management System");
        System.out.println("Please enter the name of the student you wish to add:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Please enter the age of the student you wish to add:");
        int age = input.nextInt();
        System.out.println("Please enter the GPA of the student you wish to add:");
        double gpa = input.nextDouble();
        sms.addStudent(name, age, gpa);

        input.nextLine(); // Consume the newline character
        System.out.println("Please enter the name of the course you wish to add:");
        String courseName = input.nextLine();
        System.out.println("Please enter the maximum number of students in the course you wish to add:");
        int maxStudents = input.nextInt();
        input.nextLine();  // Consume the newline character

        // Allow users to interact with the system by adding students, courses, enrolling students, and viewing lists
        System.out.println("Please enter the name of the student you wish to remove:");
        String studentName = input.nextLine();
        sms.removeStudent(studentName);
        System.out.println("Please enter the name of the course you wish to remove:");
        String courseNameToRemove = input.nextLine();
        sms.removeCourse(courseNameToRemove);
        System.out.println("Please enter the name of the course you wish to enroll:");
        String courseNameToEnroll = input.nextLine();
        System.out.println("Please enter the name of the student you wish to enroll:");
        String studentNameToEnroll = input.nextLine();
        sms.enrollStudent(studentNameToEnroll, courseNameToEnroll);
        System.out.println("Please enter the name of the course you wish to view:");
        String courseNameToView = input.nextLine();
        sms.displayStudentsByCourse(courseNameToView);
    }
}
