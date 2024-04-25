package org.example.comparator;

import org.example.entity.Human;
import org.example.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentsSorting {
    public static void agesorting(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
    }

    public static void namesorting(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getName));
    }

    public static void idsorting(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getID));
    }

    public static void surnamesorting(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getSurname));
    }

    public static void coursesorting(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getCourse));
    }

    public static void faculsitysorting(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getFaculsity));
    }

}


