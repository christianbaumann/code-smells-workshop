package dev.christianbaumann.client;

public class Client {

    private Shape shape;

    public Client(Shape shape){
        this.shape = shape;
    }

    public double calculateArea() {
        return shape.calculateArea();
    }

    public double calculatePerimeter() {
        return shape.calculatePerimeter();
    }
}
