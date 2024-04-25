package org.example.entity;

import org.example.entity.Human;

import java.util.ArrayList;

public class Teacher extends Human {

    public String subject;

    public Teacher(String name, String surname, int ID, int age, String subject) {
        super(name, surname, ID, age);
        this.subject = subject;
    }

    public static int countTeacherAverageAge(ArrayList<Teacher> teachers) {
        int totalAge = 0;
        if (teachers.isEmpty()) {
            return 0;
        } else {
            for (Teacher teacher : teachers) {
                totalAge += teacher.getAge();
            }

        }
        return totalAge / teachers.size();

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher: " + Name + " " + Surname + ", ID: " + ID + ", Age: " + age + ", Subject: " + subject;
    }

}
