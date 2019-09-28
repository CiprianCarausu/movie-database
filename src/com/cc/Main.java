package com.cc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection; // used to open a connection to a database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1995");
            System.out.println("Connection successfully");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
