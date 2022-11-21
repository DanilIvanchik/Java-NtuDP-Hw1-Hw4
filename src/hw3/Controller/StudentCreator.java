package hw3.Controller;

import hw3.Model.Human;
import hw3.Model.Student;

public class StudentCreator {
    public Student createStudent(Human human) {
        Student newStudent = new Student();
        newStudent.setFirstname(human.getFirstname());
        newStudent.setLastname(human.getLastname());
        newStudent.setMiddleName(human.getMiddleName());
        newStudent.setSex(human.getSex());
        return newStudent;
    }
}
