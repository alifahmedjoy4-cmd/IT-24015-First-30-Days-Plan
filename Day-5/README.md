# Example 1
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();         a.sound();             
}
```
# Example 2
```java
class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car drives");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();  // parent reference, child object
        v.move();               // calls Car's method
    }
}
```
