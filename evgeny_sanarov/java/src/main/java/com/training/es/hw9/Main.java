package com.training.es.hw9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static final String PATH = "./java/src/main/java/com/training/es/hw9/Employees.txt";

    public static void main(String[] args) {
        try {
            File file = new File(PATH);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        EmployeeManager.readFromFile(PATH);
        while (true) {
            System.out.println("Press 1 to add a new employee\n" +
                    "Press 2 to remove employee by ID\n" +
                    "Press 3 to view employees list\n" +
                    "Press 0 to exit");
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    EmployeeManager.addEmployee();
                    break;
                case 2:
                    EmployeeManager.removeEmployeeById();
                    break;
                case 3:
                    EmployeeManager.viewEmployees();
                    break;
                case 0:
                    System.exit(0);
            }
            writeToFile();
        }
    }

    private static void writeToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, false));
            for (Object employees : EmployeeManager.getEmployees()) {
                writer.write(String.valueOf(employees));
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}