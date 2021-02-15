package edu.java.patterns.abstractfactorty.logisticProject;

import edu.java.patterns.abstractfactorty.Developer;
import edu.java.patterns.abstractfactorty.Manager;
import edu.java.patterns.abstractfactorty.ProjectTeamFactory;
import edu.java.patterns.abstractfactorty.Tester;

public class LogisticProjectFactory implements ProjectTeamFactory {
    public Tester getTester() {
        return new TesterLogistic();
    }

    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Manager getManager() {
        return new ManagerLogisticProject();
    }
}
