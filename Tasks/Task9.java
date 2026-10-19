import static java.lang.Math.*;

public class Task9{

    public static int add(int a, int b) {
        // Your code here
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        // Your code here
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        // Your code here
        return Math.multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        // Your code here
        return Math.divideExact(a, b);
    }

    public static void main(String[] args) {
        // Demonstrate the math operations here
        System.out.println(add(1, 2));
        System.out.println(subtract(102, 75));
        System.out.println(multiply(5, 5));
        System.out.println(divide(6, 3));
    }
}