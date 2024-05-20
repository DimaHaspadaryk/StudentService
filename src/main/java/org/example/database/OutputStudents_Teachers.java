package org.example.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OutputStudents_Teachers {
    public static void printTeachers(Connection connection) throws SQLException {
        String query = "Select * from Teachers";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("TeacherID");
           String name = resultSet.getString("FirstName");
           String lastname = resultSet.getString("LastName");
           int age = resultSet.getInt("Age");
           String subject = resultSet.getString("Subject");
                System.out.println("Id: " + id +", Name: " + name + ", LastName: " + lastname + ", Age: " + age + ", Subject: " + subject);
            }

        }
    }

     public static void printTeachersId(Connection connection) throws SQLException{
        String querry = "Select TeacherID From Teachers";
        try(Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(querry)){
            while(resultSet.next()){
                int id = resultSet.getInt("TeacherId");
                System.out.println("Teachers Id are:" + id);
            }
        }
     }
    public static void printStudentsId(Connection connection) throws SQLException{
        String querry = "Select StudentId From Students1";
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querry)){
            while(resultSet.next()){
                int id = resultSet.getInt("StudentId");
                System.out.println("Students Id are:" + id);
            }
        }
    }
    public static void printStudents(Connection connection) throws SQLException {
        String query = "SELECT * FROM Students1";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                String name = resultSet.getString("FirstName");
                String surname = resultSet.getString("LastName");
                int ID = resultSet.getInt("StudentID");
                int age = resultSet.getInt("Age");
                int course = resultSet.getInt("Course");
                String faculty = resultSet.getString("Specialty");
                System.out.println("Name: " + name + ", Surname: " + surname + ", ID: " + ID + ", Age: " + age + ", Course: " + course + ", Faculty: " + faculty);
            }
        }
    }
}