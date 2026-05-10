# the Example 1
```java
/*
    This program explains two pillars of OOP:
    1. Encapsulation
    2. Inheritance
*/

// Private data + Public methods = Encapsulation

class Person {
    // private variables 
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter 
    public void setName(String name) {
        this.name = name;
    }

    // getter 
    public String getName() {
        return name;
    }

    // setter 
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // getter 
    public int getAge() {
        return age;
    }

    // display 
    public void displayPersonInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Student class inherits Person class

class Student extends Person {

    private String department;

    // constructor
    public Student(String name, int age, String department) {
        super(name, age); // calling parent constructor
        this.department = department;
    }

    // method for displaying student info
    public void displayStudentInfo() {
        displayPersonInfo(); // inherited method
        System.out.println("Department : " + department);
    }
}


// Main Class
public class Example1 {

    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student("Rakib", 21, "ICT");

        // Accessing methods
        s1.displayStudentInfo();

        System.out.println("\nUsing Getter:");
        System.out.println("Student Name: " + s1.getName());

        // Updating value using setter
        s1.setAge(22);

        System.out.println("\nAfter Updating Age:");
        s1.displayStudentInfo();
    }
}
```
# the Example 2
```java
/*
    This program explains two pillars of OOP:  
    1. Abstraction
    2. Polymorphism
*/
// Abstract class

abstract class Shape {
    abstract void area();
    void message() {
        System.out.println("This is a shape class.");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        double result = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}



//Polymorphism-> Same method name behaves differently

class Calculator {

    // method with 2 integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // same method name with 3 integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // same method name with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Example2 {

    public static void main(String[] args) {

        // Parent reference, child object
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 4);

        s1.message();
        s1.area();

        System.out.println();

        s2.message();
        s2.area();

       System.out.println("\nPolymorphism Example:");

        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: "
                + calc.add(10, 20));

        System.out.println("Addition of 3 integers: "
                + calc.add(10, 20, 30));

        System.out.println("Addition of 2 doubles: "
                + calc.add(5.5, 4.5));
    }
}
```
