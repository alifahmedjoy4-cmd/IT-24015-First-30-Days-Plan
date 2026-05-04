# The Example 1
```java
import java.time.LocalDate;

public class Example1 {

    public static void main(String[] args)
    {
        LocalDate today= LocalDate.now();
        System.out.println("Today's date: "+ today);
    }

}
```
# The Example 2
```java
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Example2 {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        ZonedDateTime zonedNow= ZonedDateTime.now();
        System.out.println("Zoned time and date now : "+zonedNow);
    }

}
```
