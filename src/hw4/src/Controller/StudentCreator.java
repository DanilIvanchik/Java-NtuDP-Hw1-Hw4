package hw4.src.Controller;

import hw4.src.Model.Human;
import hw4.src.Model.Student;

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
