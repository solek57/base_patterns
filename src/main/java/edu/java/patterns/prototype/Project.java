package edu.java.patterns.prototype;

import com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl;

public class Project implements Copyable {

    private String projectName;
    private String source;

    public Project(String projectName, String source) {
        this.projectName = projectName;
        this.source = source;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object copy() {
        return new Project(projectName, source);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
