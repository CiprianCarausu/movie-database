package com.cc;

import com.cc.constants.Constants;
import com.cc.db.DatabaseWrapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

       /* //region read data from terminal
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

        //endregion
*/

        DatabaseWrapper databaseWrapper = new DatabaseWrapper();
        Connection connection = null;
        try {
            connection = databaseWrapper.createConnection(
                    Constants.DB_DRIVER_IMPLEMENTATION + Constants.DB_CONN_String,Constants.DB_USERNAME,Constants.DB_PASSWORD);

            databaseWrapper.createTable();
            databaseWrapper.insertRecord("Superman");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
