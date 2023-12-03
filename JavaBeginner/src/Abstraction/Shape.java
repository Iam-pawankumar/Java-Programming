package Abstraction;

abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract public double calculateArea();

    abstract public double calculatePerimeter();

    public void display(){
        System.out.printf("Area of %s is %f Sq CMs and Perimeter is %f Sq CMs", name, calculateArea(), calculatePerimeter()).println();
    }
}
