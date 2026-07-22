package com.dgm.roadmap.challenge009;

public class ProjectManager extends Manager{
    private String projectName;

    public ProjectManager(String name, int id, String projectName) {
        super(name, id);
        this.projectName = projectName;
    }

    public void assignProject(String projectName) {
        this.projectName = projectName;
    }

    public void showProject() {
        System.out.println("Current project: " + projectName);
    }
}
