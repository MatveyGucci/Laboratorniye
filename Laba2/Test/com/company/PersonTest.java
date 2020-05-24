package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testEquals() {
        Person Tom = new Person("Tom","Sawyer", 12);
        Person Abraham = new Person("Abraham", "Linkoln",56);
        Boolean b1 = Tom.equals(Abraham);
        assertEquals(false, b1);
    }

    @Test
    void toJson() {
      Person Tom = new Person("Tom","Sawyer", 12);
       String S1 = "";
       S1 = Tom.toJson();
       assertEquals("{\"name\":\"Tom\",\"scndname\":\"Sawyer\",\"YeasrsOld\":12}", S1);
    }

    @Test
    void fromJson() {
        String S1 = "{\"name\":\"Tom\",\"scndname\":\"Sawyer\",\"YeasrsOld\":12}";
        Person Tom = new Person("Tom","Sawyer", 12);
        Person person = Person.fromJson(S1);
        assertEquals(Tom, person);
    }
}