package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://haspadaryk.mssql.somee.com:1433;databaseName=haspadaryk";
        String user = "haspad_SQLLogin_1";
        String password = "m1628290";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Соединение с базой данных установлено.");



            connection.close();
            System.out.println("Соединение с базой данных закрыто.");
        } catch (SQLException e) {
            System.err.println("Ошибка при подключении к базе данных: " + e.getMessage());
        }
    }
}
