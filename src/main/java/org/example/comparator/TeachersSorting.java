package org.example.comparator;

import org.example.entity.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TeachersSorting {


    public static void agesorting(ArrayList<Teacher> teachers){

        Collections.sort(teachers, Comparator.comparing(Teacher::getAge));
    }

    public static void namesorting(ArrayList<Teacher> teachers){

        Collections.sort(teachers, Comparator.comparing(Teacher::getName));
    }

    public static void idsorting(ArrayList<Teacher> teachers){

        Collections.sort(teachers, Comparator.comparing(Teacher::getID));
    }
    public static void surnamesorting(ArrayList<Teacher> teachers){

        Collections.sort(teachers, Comparator.comparing(Teacher::getSurname));
    }

public static void subjectsurting(ArrayList<Teacher> teachers){
        Collections.sort(teachers,Comparator.comparing(Teacher::getSubject));
}
}
