import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Select operation - Add(+), Subtract(-), Multiply(*), Divide(/): ");
        String opt = scanner.next();
        switch(opt){
            case "+":
                System.out.println(addition(num1, num2));
                break;
            case "-":
                System.out.println(subtraction(num1, num2));
                break;
            case "*":
                System.out.println(multiplication(num1, num2));
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("Cannot divide by zero");
                } else System.out.println(division(num1, num2));
                break;
        }
        scanner.close();
    }

    public static double addition(double a, double b){
        return a + b;
    }

    public static double subtraction(double a, double b){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

}
