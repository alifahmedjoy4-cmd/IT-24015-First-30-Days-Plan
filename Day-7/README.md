# Example 1
```java
class Outer {
    int x = 10;

    class Inner {
        void show() {
            System.out.println(x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}
```
# Example 2
```java
class Outer {
    static int x = 20;

    static class Inner {
        void show() {
            System.out.println(x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.show();
    }
}
```
