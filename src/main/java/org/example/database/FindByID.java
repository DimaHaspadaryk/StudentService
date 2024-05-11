package org.example.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindByID {
    public static void findTeacher(Connection connectionm,int TeacherID) throws SQLException{
        String query = "Select * From Teachers where TeacherId = ?";
        try(PreparedStatement statement = connectionm.prepareStatement(query)){
            statement.setInt(1,TeacherID);
            try(ResultSet resultSet = statement.executeQuery()){
                if(resultSet.next()){
                    int id = resultSet.getInt("TeacherID");
                    String name = resultSet.getString("FirstName");
                    String lastname = resultSet.getString("LastName");
                    int age = resultSet.getInt("Age");
                    String subject = resultSet.getString("Subject");
                    System.out.println("Id: " + id +", Name: " + name + ", LastName: " + lastname + ", Age: " + age + ", Subject: " + subject);}
                    else{
                        System.out.println("Teacher with ID" + TeacherID + " not found.");
                    }
                }
            }
        }


    public static void findStudents(Connection connection, int StudentID) throws SQLException {
        String query = "Select * from Students1 Where StudentID = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, StudentID);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String name = resultSet.getString("FirstName");
                    String surname = resultSet.getString("LastName");
                    int ID = resultSet.getInt("StudentID");
                    int age = resultSet.getInt("Age");
                    int course = resultSet.getInt("Course");
                    String faculty = resultSet.getString("Specialty");
                    System.out.println("Name: " + name + ", Surname: " + surname + ", ID: " + ID + ", Age: " + age + ", Course: " + course + ", Faculty: " + faculty);
                } else {
                    System.out.println("Student with ID " + StudentID + " not found.");
                }
            }
        }
    }
}
