# The Example 1
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");

        System.out.println(list);
        System.out.println(list.get(1));
    }
}
```
# The Example 2
```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");

        System.out.println(list);
        list.remove("C++");
        System.out.println(list);
    }
}
```
