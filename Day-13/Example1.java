import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Watermelon", 3);
        map.put("Lychee", 1);
        map.put("Mango", 2);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
