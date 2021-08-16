package com.training.es.hw9;

public class Employee {
    public static int counter;
    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName) {
        if (EmployeeManager.getEmployees().size() >= 1) {
            counter = EmployeeManager.getLastId();
        } else {
            counter = 0;
        }
        counter++;
        id = counter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", id, firstName, lastName);
    }

    public int getId() {
        return id;
    }
}