package com.company;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.StringWriter;

public class Main {

    public static void main(String[] args) {
        String S1 = "{\"name\":\"Tom\",\"scndname\":\"Sawyer\",\"YeasrsOld\":12}";
        Person Tom = new Person("Tom","Sawyer", 12);
        Person person = Person.fromJson(S1);
        System.out.println(person.name+person.scndname+person.YeasrsOld);
    }
}
