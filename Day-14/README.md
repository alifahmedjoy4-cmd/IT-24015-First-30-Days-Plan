# The Example 1
```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example1 {
    public static void main(String[] args)
    {
        String dateString= "2026-05-02";
        // Create a DateTimeFormater to define the expected format

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //Parse the string into a localDate object

        LocalDate date= LocalDate.parse(dateString, formatter);
       System.out.println("Parsed Date: "+ date);
    }

}
```
# The Example 2
```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Example2 {
    public static void main(String[] args)
    {
        String sentence = "The event will take place on 2025-01-23.";

        //Define the date pattern

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Extract the date part from the string

        String dateString  = sentence.substring(sentence.indexOf("on")+ 3, sentence.indexOf("."));
        try {
            LocalDate date = LocalDate.parse(dateString,formatter);
            System.out.println("Extracted Date: "+date);
        }catch (DateTimeParseException e){
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
```
