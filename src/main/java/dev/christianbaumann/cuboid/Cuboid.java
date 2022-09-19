package dev.christianbaumann.cuboid;

public class Cuboid {
    int a, b, c;

    public Cuboid(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculateArea() {
        return 2 * a * b +
               2 * b * c +
               2 * a * c;
    }
}
