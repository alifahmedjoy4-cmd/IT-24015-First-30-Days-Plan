# The Example 1
```java


class Temp {

    // Default constructor
    Temp() {
        // Calling constructor with one parameter
        this(5);

        System.out.println("The Default Constructor");
    }

    // Constructor with one parameter
    Temp(int x) {
        // Calling constructor with two parameters
        this(5, 15);

        System.out.println("Value of x: " + x);
    }

    // Constructor with two parameters
    Temp(int x, int y) {
        System.out.println("Product of x and y: " + (x * y));
    }
}

// Main class
public class Example1 {

    public static void main(String[] args) {

        // Creating object of Temp class
        new Temp();
    }
}
```
# The Example 2
```java

class Base {

    String name;

    // Constructor 1
    Base() {
        this("");

        System.out.println("No-argument constructor of base class");
    }

    // Constructor 2
    Base(String name) {
        this.name = name;

        System.out.println("Calling parameterized constructor of base");
    }
}
\
class Derived extends Base {

    // Constructor 3
    Derived() {

        System.out.println("No-argument constructor of derived");
    }

    // Constructor 4
    Derived(String name) {

        // Calls parameterized constructor of Base class
        super(name);

        System.out.println("Calling parameterized constructor of derived");
    }
}

// Main class
public class Example2 {
    public static void main(String[] args) {
        Derived obj = new Derived("test");

     
    }
}
```
