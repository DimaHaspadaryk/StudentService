package org.example.dataInput;

import org.example.entity.Student;
import org.example.entity.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class InputData {

    public static void inputStudentData(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's data \n ------------------ ");
        while (true) {
            System.out.println("Do you want to add one more student?:");
            String ans = scanner.nextLine();
            if(ans.equals("no"))break;
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Surname: ");
            String surname = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Course: ");
            int course = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Faculty: ");
            String faculty = scanner.nextLine();

            students.add(new Student(name, surname, id, age, course, faculty));
        }
    }

    public static void inputTeacherData(ArrayList<Teacher> teachers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter teacher's data \n ------------------ ");
        while (true) {
            System.out.println("Do you want to add one more teacher?:");
            String ans = scanner.nextLine();
            if(ans.equals("no"))break;
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Surname: ");
            String surname = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Subject: ");
            String subject = scanner.nextLine();


            teachers.add(new Teacher(name, surname, id, age, subject));
        }
    }
}
