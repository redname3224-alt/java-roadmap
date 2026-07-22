package com.dgm.roadmap.challenge009;

public class Employee {
    protected int id;
    protected String name;

    public Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printInfo() {
        System.out.println(getName() + ": " + getId());
    }
}
