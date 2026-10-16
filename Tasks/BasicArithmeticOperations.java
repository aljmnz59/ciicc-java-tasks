import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main() {
        BasicArithmeticOperations b1 = new BasicArithmeticOperations();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Select operation - Add(+), Subtract(-), Multiply(*), Divide(/): ");
        String opt = scanner.next();
        switch(opt){
            case "+":
                System.out.println(b1.addition(num1, num2));
                break;
            case "-":
                System.out.println(b1.subtraction(num1, num2));
                break;
            case "*":
                System.out.println(b1.multiplication(num1, num2));
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("Cannot divide by zero");
                } else System.out.println(b1.division(num1, num2));
                break;
        }
        scanner.close();
    }

    public double addition(double a, double b){
        return a + b;
    }

    public double subtraction(double a, double b){
        return a - b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

}
