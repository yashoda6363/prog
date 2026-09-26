package com.example.vvce.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    App app = new App();

    @Test
    void testAdd() {
        assertEquals(25, app.add(20, 5));
    }

    @Test
    void testSubstract() {
        assertEquals(15, app.sub(20, 5));
    }

    @Test
    void testMultiple() {
        assertEquals(100, app.mul(20, 5));
    }
}
