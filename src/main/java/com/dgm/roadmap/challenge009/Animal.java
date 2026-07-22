package com.dgm.roadmap.challenge009;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void cry(){
        System.out.println(getName()+": generic animal sound");
    }
}
