package dev.christianbaumann.cuboid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuboidTests {

    private Cuboid cuboid = new Cuboid(6, 4, 3);

    @Test
    void area() {
        assertEquals(108, cuboid.calculateArea());
    }
}

