package edu.java.patterns.prototype;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project("master", "javacode");
        System.out.println(project.toString());

        ProjectFactory projectFactory = new ProjectFactory(project);
        Project copyProject = projectFactory.copyProject();
        System.out.println(copyProject.toString());

    }
}
