# The code of Example 01
public class Car {
    String color;
    String model;
    int year;

    void displayInfo() {
        System.out.println("Car's Color : " + color);
        System.out.println("Car's Model : " + model);
        System.out.println("Car's Year  : " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Black";
        myCar.model = "Toyota";
        myCar.year = 2025;
        myCar.displayInfo();
    }
}
# The code of Example 02
class Student {
    String name;
    int Roll;
    String district;
    String Number;

    void Show() {
        System.out.println("Name: ");
        System.out.println("Roll: ";
        System.out.println("District: ");
        System.out.println("Number: ");
        System.out.println();
    }
}

public class Main_student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alif Ahmed Joy";
        s1.Roll = 15;
        s1.district = "Tangail";
        s1.Number = "01630169756";
        s1.Show();

        Student s2 = new Student();
        s2.name = "Alif";
        s2.Roll = 66;
        s2.district = "Cumilla";
        s2.Number = "01629277953";
        s2.Show();

        Student s3 = new Student();
        s3.name = "Anom";
        s3.Roll = 67;
        s3.district = "Chittagong";
        s3.Number = "01749123456";
        s3.Show();
    }
}
