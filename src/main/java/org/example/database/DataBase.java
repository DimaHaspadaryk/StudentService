package org.example.database;

import java.sql.*;

import static org.example.database.FindByID.findStudents;
import static org.example.database.FindByID.findTeacher;
import static org.example.database.OutputStudents_Teachers.printStudents;
import static org.example.database.OutputStudents_Teachers.printTeachers;

public class DataBase {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://haspadaryk.mssql.somee.com:1433;databaseName=haspadaryk";
        String user = "haspad_SQLLogin_1";
        String password = "m1628290";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection with DataBase is established");

            System.out.println("Teachers:");
            printTeachers(connection);
            System.out.println("looking teacher");
            findTeacher(connection,4435);

            System.out.println("Looking student:");
            findStudents(connection,2);

            connection.close();
            System.out.println("Connection with DataBase is close.");
        } catch (SQLException e) {
            System.err.println("Exeption with connection to DataBase: " + e.getMessage());
        }
    }
        }



