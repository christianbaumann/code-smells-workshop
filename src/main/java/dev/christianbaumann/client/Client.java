package dev.christianbaumann.client;

public class Client {
    private double a;
    private double b;
    private double r;

    public Client(double a, double b, double r) {
        this.a = a;
        this.b = b;
        this.r = r;
    }

    public double calculateArea(Shape shape) {
        double area = 0;

        switch (shape) {
            case SQUARE:
                area = a * a;
                break;
            case RECTANGLE:
                area = a * b;
                break;
            case CIRCLE:
                area = Math.PI * r * r;
                break;
        }

        return area;
    }

    public double calculatePerimeter(Shape shape) {
        double perimeter = 0;

        switch (shape) {
            case SQUARE:
                perimeter = 4 * a;
                break;
            case RECTANGLE:
                perimeter = 2 * (a + b);
                break;
            case CIRCLE:
                perimeter = 2 * 3.14 * r;
                break;
        }

        return perimeter;
    }
}
