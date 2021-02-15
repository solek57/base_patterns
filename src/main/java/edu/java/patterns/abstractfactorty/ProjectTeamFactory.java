package edu.java.patterns.abstractfactorty;

public interface ProjectTeamFactory {

    public Tester getTester();

    public Developer getDeveloper();

    public Manager getManager();
}
