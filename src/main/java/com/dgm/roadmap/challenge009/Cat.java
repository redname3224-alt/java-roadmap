package com.dgm.roadmap.challenge009;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void cry(){
        System.out.println(getName()+": Meow!");
    }
}
