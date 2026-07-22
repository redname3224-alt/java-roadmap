package com.dgm.roadmap.challenge009;

public class Programmer extends Employee{
    private String programmingLanguage;

    public Programmer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void writeCode() {
        System.out.println(getName() + " is writing " + getProgrammingLanguage() + " code.");
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

}
