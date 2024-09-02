package com.Ritik_Kumar_Singh.assignment.utilities;

import com.Ritik_Kumar_Singh.assignment.employees.Employee;
import com.Ritik_Kumar_Singh.assignment.employees.Manager;
import com.Ritik_Kumar_Singh.assignment.employees.Developer;

/**
 * Utility class to handle Employee-related operations.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of an employee.
     * 
     * @param employee The employee whose details are to be printed.
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            System.out.println("Team Size: " + ((Manager) employee).getTeamSize());
        } else if (employee instanceof Developer) {
            System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
        }
    }

    /**
     * Calculates the annual bonus for an employee.
     * 
     * @param employee The employee whose bonus is to be calculated.
     * @return The bonus amount.
     */
    public static double calculateAnnualBonus(Employee employee) {
        return employee.getSalary() * 0.10; // 10% of the salary as bonus
    }
}