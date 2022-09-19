package dev.christianbaumann.cuboid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuboidTests {

    private Cuboid cuboid = new Cuboid(6, 4, 3);

    @Test
    public void area() {
        assertEquals(108, cuboid.calculateArea());
    }
}

