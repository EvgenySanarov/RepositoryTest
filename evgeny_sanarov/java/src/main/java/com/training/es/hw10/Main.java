package com.training.es.hw10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public final static String PATH = "jdbc:sqlite:java/src/main/resources/db/employees.db";

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(PATH);
            EmployeeManager manager = new EmployeeManager();
            while (true) {
                System.out.println("Press 1 to add a new employee\n" +
                        "Press 2 to remove employee by ID\n" +
                        "Press 3 to view employees list\n" +
                        "Press 0 to exit");
                Scanner scanner = new Scanner(System.in);
                int operation = scanner.nextInt();
                switch (operation) {
                    case 1:
                        manager.addEmployee(connection);
                        break;
                    case 2:
                        manager.removeEmployeeById(connection);
                        break;
                    case 3:
                        manager.viewEmployees(connection);
                        break;
                    case 0:
                        System.exit(0);
                }
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}