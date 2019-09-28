package com.cc.db;

import com.cc.constants.Constants;

import java.sql.*;

public class DatabaseWrapper {
    private Connection connection;

    /**
     * @param url
     * @param user
     * @param password
     * @return
     * @throws SQLException
     */

    public Connection createConnection(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public void createTable() throws SQLException {
        Statement statement = connection.createStatement();

        statement.executeUpdate("CREATE TABLE IF NOT EXISTS movies (id INTEGER PRIMARY KEY AUTO_INCREMENT, name TEXT NOT NULL) ");
    }

    public void insertRecord(String movieName) throws SQLException{
        /*
        INSERT INTO table_name(column1, column2, column3) (VALUES (val1, val2, val3)
         */
        PreparedStatement statement = connection.prepareStatement("INSERT INTO movies (name) VALUES (?)");
     statement.setString(1,movieName);
     statement.execute();
    }
}