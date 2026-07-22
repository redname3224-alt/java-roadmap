package com.dgm.roadmap.challenge009;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void cry(){
        System.out.println(getName()+": Woof!");
    }
}
