package com.training.es.hw10;

import java.sql.*;
import java.util.Scanner;

public class EmployeeManager {
    Scanner scanner = new Scanner(System.in);

    public void addEmployee(Connection connection) throws SQLException {
        System.out.println("Enter firstname");
        String firstname = scanner.nextLine();
        System.out.println("Enter lastname");
        String lastname = scanner.nextLine();
        String sql = "INSERT INTO Employees (firstname, lastname) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, firstname);
        preparedStatement.setString(2, lastname);
        preparedStatement.executeUpdate();
    }

    public void removeEmployeeById(Connection connection) throws SQLException {
        System.out.println("Enter ID");
        int id = scanner.nextInt();
        String sql = "DELETE FROM Employees WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public void viewEmployees(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Employees");

        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String firstname = resultSet.getString(2);
            String lastname = resultSet.getString(3);
            System.out.println(id + " " + firstname + " " + lastname);
        }
    }
}