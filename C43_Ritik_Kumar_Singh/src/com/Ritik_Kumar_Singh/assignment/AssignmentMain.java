package com.Ritik_Kumar_Singh.assignment;

import com.Ritik_Kumar_Singh.assignment.employees.Manager;
import com.Ritik_Kumar_Singh.assignment.employees.Developer;
import com.Ritik_Kumar_Singh.assignment.utilities.EmployeeUtilities;

/**
 * The main class to demonstrate the usage of Employee, Manager, Developer, and EmployeeUtilities.
 */
public class AssignmentMain {

    public static void main(String[] args) {
        // Creating instances of Manager and Developer
        Manager manager = new Manager("Alice", 101, 90000.0, 10);
        Developer developer = new Developer("Bob", 102, 80000.0, "Java");

        // Using EmployeeUtilities to perform operations
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        // Calculating and printing annual bonus
        System.out.println("Manager's Bonus: " + EmployeeUtilities.calculateAnnualBonus(manager));
        System.out.println("Developer's Bonus: " + EmployeeUtilities.calculateAnnualBonus(developer));
    }
}