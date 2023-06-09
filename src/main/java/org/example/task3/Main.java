package org.example.task3;

import org.example.task3.student.GrupStudent;
import org.example.task3.student.Student;

import java.util.*;

public class Main {
    private static final List<Student> listStudents = new ArrayList<>();
    // private static final Map<GrupStudent, List<Student>> mapGrupFacultyYear = new HashMap<>();

    public static void main(String[] args) {
        addStudent("pavel", "kiber", 1);
        addStudent("alexei", "kiber", 1);
        addStudent("rita", "kiber", 3);
        addStudent("emma", "kiber", 3);
        addStudent("dima", "freza", 2);
        addStudent("ilia", "freza", 3);
        addStudent("trov", "freza", 4);
        addStudent("igor", "freza", 4);

        searchAllStudent("kiber", 3);

        deleteStudent("trov", "freza", 4);

        allStudent();

//        for (Student listStudent : listStudents) {
//            System.out.println(listStudent);
//        }
    }

    private static void addStudent(String name, String faculty, int year) {
        listStudents.add(new Student(name, faculty, year));
    }

    private static void deleteStudent(String name, String faculty, int year) {
        listStudents.remove(new Student(name, faculty, year));
    }

    private static List<Student> searchAllStudent(String faculty, int year) {
        GrupStudent grupStudent = new GrupStudent(faculty, year);
        getMapGrupFacultyYear().get(grupStudent).forEach(System.out::println);
        return getMapGrupFacultyYear().get(grupStudent);
    }

    private static void allStudent() {
        getMapGrupFacultyYear().forEach((key, value) -> {
            System.out.println(key.toString());
            for (Student student : value) {
                System.out.println(student.toString());
            }
        });
    }

    private static Map<GrupStudent, List<Student>> getMapGrupFacultyYear() {
        Map<GrupStudent, List<Student>> mapGrupFacultyYear = new HashMap<>();
        for (Student listStudent : listStudents) {
            List<Student> studentsYearFaculty = new ArrayList<>();
            if (!mapGrupFacultyYear.containsKey(listStudent.facultyYear())) {
                mapGrupFacultyYear.put(listStudent.facultyYear(), studentsYearFaculty);
                mapGrupFacultyYear.get(listStudent.facultyYear()).add(listStudent);
            } else {
                mapGrupFacultyYear.get(listStudent.facultyYear()).add(listStudent);
            }
        }
        return mapGrupFacultyYear;
    }
}
