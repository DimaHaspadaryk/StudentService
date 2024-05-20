package org.example.database;

import java.sql.*;

import static org.example.database.FindByID.findStudents;
import static org.example.database.FindByID.findTeacher;
import static org.example.database.OutputStudents_Teachers.*;

public class DataBase {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://haspadaryk.mssql.somee.com:1433;databaseName=haspadaryk";
        String user = "haspad_SQLLogin_1";
        String password = "m1628290";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection with DataBase is established");
            printTeachers(connection);
            printTeachersId(connection);
            printStudentsId(connection);

            connection.close();
            System.out.println("Connection with DataBase is close.");
        } catch (SQLException e) {
            System.err.println("Exeption with connection to DataBase: " + e.getMessage());
        }
    }
}



