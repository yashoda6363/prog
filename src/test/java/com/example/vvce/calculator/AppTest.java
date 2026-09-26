package com.example.vvce.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	App app=new App();
	
	void testAdd() {
    	assertEquals(25,app.add(20,5));
	}

    void testsubstract() {
        assertEquals(15,app.sub(20,5));
    }
    void testmultiple() {
        assertEquals(15,app.mul(20,5));
}
}
