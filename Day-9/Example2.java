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
