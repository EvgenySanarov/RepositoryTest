package com.training.es.hw9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManager {

    private static List<Employee> list = new ArrayList<>();

    public static List<Employee> getEmployees() {
        return list;
    }

    public static void readFromFile(String PATH) {
        try {
            Stream<String> lineStream = Files.lines(Paths.get(PATH));
            EmployeeManager.list = lineStream.map(s -> s.split(" "))
                    .map(strings -> new Employee(Integer.parseInt(strings[0]), strings[1], strings[2]))
                    .collect(Collectors.toList());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstname");
        String firstname = scanner.nextLine();
        System.out.println("Enter lastname");
        String lastname = scanner.nextLine();
        Employee employee = new Employee(firstname, lastname);
        list.add(employee);
    }

    public static void removeEmployeeById() throws RuntimeException {
        System.out.println("ID to remove");
        Scanner remove = new Scanner(System.in);
        int id = remove.nextInt();

        Employee employeeToDelete = list.stream().filter(employee -> employee.getId() == id).findFirst()
                .orElseThrow(() -> new RuntimeException("No employee with such ID found: " + id));
        list.remove(employeeToDelete);
    }

    public static void viewEmployees() {
        for (Object employees : list) {
            System.out.println(employees);
        }
    }

    public static int getLastId() {
        List<Object> lastIdList = Collections.singletonList(list.stream().max(Comparator.comparing(Employee::getId)));
        return Integer.parseInt(lastIdList.toString().replaceAll("\\D+", ""));
    }
}