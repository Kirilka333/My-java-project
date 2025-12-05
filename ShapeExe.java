public class ShapeExe {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5.0, 10.0);
        Shape square = new Square(7.0);
        Shape circle = new Circle(4.0);

        System.out.println("Rectangle area: " + rect.calculateArea());
        System.out.println("Rectangle perimeter: " + rect.calculatePerimeter());

        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
    }
}

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side); // подава страната и на width и на height
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    // Не е нужен override - методите на Rectangle работят правилно!
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}