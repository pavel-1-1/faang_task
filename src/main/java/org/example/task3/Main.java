package org.example.task3;

import org.example.task3.student.GrupStudent;
import org.example.task3.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final List<Student> listStudents = new ArrayList<>();
    private static final Map<GrupStudent, List<Student>> mapGrupFacultyYear = new HashMap<>();

    public static void main(String[] args) {
        addStudent("pavel", "kiber", 1);
        addStudent("alexei", "kiber", 1);
        addStudent("dima", "freza", 3);
        addStudent("ilia", "freza", 3);
        getMapGrupFacultyYear(listStudents);


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
        List<Student> students = new ArrayList<>();
        mapGrupFacultyYear.forEach((key, value) -> key.equals(grupStudent) );
        return
    }

    private static Map<GrupStudent, List<Student>> getMapGrupFacultyYear(List<Student> listStudents) {
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
