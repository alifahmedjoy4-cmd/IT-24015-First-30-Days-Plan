# The Example 1
```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    // Shallow copy method
    Student(Student s) {
        this.name = s.name;
    }
}

public class Example1 {

    public static void main(String[] args) {

        // Reference copy 
        Student s1 = new Student("Rahim");
        Student s2 = s1; // reference copy

        s2.name = "Karim";

        System.out.println("Reference Copy:");
        System.out.println("s1 name: " + s1.name);
        System.out.println("s2 name: " + s2.name);

        // Shallow copy 
        Student s3 = new Student("Ayesha");
        Student s4 = new Student(s3); // shallow copy

        s4.name = "Nila";

        System.out.println("\nShallow Copy:");
        System.out.println("s3 name: " + s3.name);
        System.out.println("s4 name: " + s4.name);
    }
}
```
# The Example 2
```java
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    // Deep copy method
    Book deepCopy() {
        return new Book(new String(this.title));
    }
}

public class Example2 {

    public static void main(String[] args) {

        Book b1 = new Book("Java");

        // Deep copy
        Book b2 = b1.deepCopy();

        b2.title = "Python";

        System.out.println("Deep Copy Example:");
        System.out.println("b1 title: " + b1.title);
        System.out.println("b2 title: " + b2.title);
    }
}
```
