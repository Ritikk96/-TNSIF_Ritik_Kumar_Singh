package com.Ritik_Kumar_Singh.assignment.employees;

public class Developer extends Employee {
    // Additional attribute for Developer
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter and Setter methods for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}