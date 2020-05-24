package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void program() {
    }

    @Test
    void sort() {
        Main main = new Main();
        assertEquals("desq" ,main.sort("desq"));
        assertEquals("" ,main.sort("ppp"));

    }
}