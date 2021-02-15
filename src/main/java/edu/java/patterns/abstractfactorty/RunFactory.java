package edu.java.patterns.abstractfactorty;

import edu.java.patterns.abstractfactorty.logisticProject.LogisticProjectFactory;

/**
 * Цель - создание интерфейса, для создания множества взаимосвязанных объектов, без привязки к конкретным классам.
 */
public class RunFactory {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new LogisticProjectFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        developer.writeCode();
        tester.testProgram();
        manager.manageProject();
    }
}
