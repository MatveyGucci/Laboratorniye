package com.company;

import com.google.gson.Gson;

public class Person {
    String name;
    String scndname;
    int YeasrsOld;
    public Person (String name, String scndname, int YearsOld)
    {
        this.name = name;
        this.scndname = scndname;
        this.YeasrsOld = YearsOld;
    }
    public final boolean equals(Object object)
    {
        Person person = (Person) object;
        if(this == object) {
            return true;
        }
        if (person.name.equals(this.name) && person.scndname.equals(this.scndname) && person.YeasrsOld == this.YeasrsOld)
            return true;
        else
            return false;
    }
    public final int hashCode(){
        return name.hashCode() + scndname.hashCode() + YeasrsOld;
    }
    public String toJson()
    {
        Gson obj = new Gson();
        String p =  obj.toJson(this);
        return (p);
    }
    public static Person fromJson(String string){
        Gson o = new Gson();
        Person p = o.fromJson(string,Person.class);
        return (p);
    }
}