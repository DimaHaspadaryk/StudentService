package org.example;

import org.example.comparator.StudentsSorting;
import org.example.dataInput.InputData;
import org.example.entity.Human;
import org.example.entity.Student;
import org.example.entity.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();
            ArrayList<Teacher> teachers = new ArrayList<>();

       Student student = new Student("asd","asd",213,12,12,"asd");
       Student student1 = new Student("asd","asd",213,12,12,"asd");
       Student student2 = new Student("asd","asd",215,12,12,"asd");
       Student student3 = new Student("asd","asd",2312,12,12,"asd");
       students.add(student);
       students.add(student1);
       students.add(student2);
       students.add(student3);


        System.out.println(teachers.toString());
        System.out.println(students.toString());



//        String url = "jdbc:sqlserver://haspadaryk.mssql.somee.com:1433;databaseName=haspadaryk";
//        String user = "haspad_SQLLogin_1";
//        String password = "m1628290";
//
//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//            Statement statement = ((java.sql.Connection) connection).createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM Students1");
//
//            while (resultSet.next()) {
//                int studentID = resultSet.getInt("StudentID");
//                String firstName = resultSet.getString("FirstName");
//                String lastName = resultSet.getString("LastName");
//                int age = resultSet.getInt("Age");
//                int course = resultSet.getInt("Course");
//                String specialty = resultSet.getString("Specialty");
//
//                System.out.println("ID: " + studentID + ", Имя: " + firstName + ", Фамилия: " + lastName +
//                        ", Возраст: " + age + ", Курс: " + course + ", Специальность: " + specialty);
//            }
//        } catch (SQLException e) {
//            System.err.println("Ошибка при выполнении запроса: " + e.getMessage());
//        }

        }
    }
