import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("C++");
        set.add("Python");
        set.add("Java");

        System.out.println(set);
    }
}
