package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class cashregisterTest {

    @Test
    void scanproducts() {
        ArrayList<String> cheque = new ArrayList<String>();
        ArrayList<product> basket = new ArrayList<product>();
        product cuc = new product("огурец", 10);
        product cuc1 = new product("помидор", 10);
        product cuc2 = new product("кукуруза", 10);
        basket.add(cuc);basket.add(cuc1);basket.add(cuc1);basket.add(cuc2);
        cashregister cashregister = new cashregister();
        cheque = cashregister.scanproducts(basket);
        String test ="помидор 2 20грн";
        assertEquals(test,cheque.get(2));
    }
}