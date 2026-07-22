package com.dgm.roadmap.challenge009;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private final List<Employee> team;

    public Manager(String name, int id) {
        super(name,id);
        team = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        team.add(employee);
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void showTeam() {
        System.out.println("Team of " + getName() + ":");
        for (Employee employee : team) {
            employee.printInfo();
        }
    }

    public void holdMeeting() {
        System.out.println(getName() + " is holding a team meeting.");
    }



}
