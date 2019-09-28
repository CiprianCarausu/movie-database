package com.cc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        String user = "";
        String password = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter the username: ");
            user = reader.readLine();

            System.out.println("Please enter the password: ");
            password = reader.readLine();
        } catch (Exception ex) {
        }

        try {
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", user, password);
            System.out.println("Connection successfully");
        } catch (
                Exception ex) {
            System.out.println(ex.getMessage());
            for (StackTraceElement entry : ex.getStackTrace()) {
                System.out.println(entry.getMethodName());
            }
        }
    }
}
