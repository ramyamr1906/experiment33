package com.example.vvce.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import com.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
	App app = new App();
	
    void testAdd() {
    	assertEquals(25, app.add(20, 5));
    }
    
    void testSubtract() {
    	assertEquals(15, app.sub(20, 5));
    }
}
