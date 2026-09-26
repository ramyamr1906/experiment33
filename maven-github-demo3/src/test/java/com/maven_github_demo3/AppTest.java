package com.example.maven_github_demo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class AppTest {
    void testTotal() {
        assertEquals(225,
            App.calculateTotal(75, 68, 82));
    }

    void testAverage() {
        assertEquals(75.0,
            App.calculateAverage(75, 68, 82));
    }

    void testPass() {
        assertTrue(App.isPass(75.0));
    }
    void testFail() {
        assertFalse(App.isPass(35.0));
    }
}
