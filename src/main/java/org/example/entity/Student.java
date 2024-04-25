package org.example.entity;

import java.util.ArrayList;

public class Student extends Human {

    public int course;
    public String faculsity;

    public Student(String name, String surname, int ID, int age, int course, String faculsity) {
        super(name, surname, ID, age);
        this.course = course;
        this.faculsity = faculsity;
    }
    public static int countStudentAverageAge(ArrayList<Student> students) {
        int totalAge = 0;
        if (students.isEmpty()) {
            return 0;
        } else {
            for (Student student : students) {
                totalAge += student.getAge();
            }

        }
        return totalAge / students.size();

    }
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculsity() {
        return faculsity;
    }

    public void setFaculsity(String faculsity) {
        this.faculsity = faculsity;
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", Surname :" + Surname + ", ID: " + ID + ", Age: " + age + ", Course: " + course + ", Faculty: " + faculsity;
    }


}
