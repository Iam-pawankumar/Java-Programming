package Abstraction;

public class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(String name, double length, double breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
