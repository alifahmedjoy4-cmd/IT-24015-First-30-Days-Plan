import java.util.Scanner;

# Code
```java
public class Harshad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int rem, sum = 0;

        while (temp > 0) {
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        if (num % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }

        sc.close();
    }
}
```
