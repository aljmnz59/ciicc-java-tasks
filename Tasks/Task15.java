interface Shape{
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape{
    String color;
    double length;
    double width;

    AbstractShape(String color, double length, double width){
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }
}

class Circle extends AbstractShape{
    double radius;
    public Circle(String color, double radius) {
        super(color, 0, 0);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape{
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Task15 {
    static void main(String[] args) {
        Shape c1 = new Circle("Yellow", 5.0);
        Shape r1 = new Rectangle("Black", 2.3, 8.5);

        System.out.printf("Circle area: %.2f%n", c1.calculateArea());
        System.out.printf("Circle perimeter: %.2f%n", c1.calculatePerimeter());
        System.out.println("----------------------------");
        System.out.printf("Rectangle area %.2f%n", r1.calculateArea());
        System.out.printf("Rectangle perimeter %.2f%n", r1.calculatePerimeter());

    }
}
