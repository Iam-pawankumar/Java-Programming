package Abstraction;

public class ShapeRunner {

    public static void main(String []args){
        Shape[] shapes = {
                new Circle("Circle", 5.0),
                new Square("Square", 5.0),
                new Rectangle("Rectange", 15.0, 5.0)
        };
        for (Shape shape:shapes){
            shape.display();
        }
    }
}
