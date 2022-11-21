package hw4.src.Controller;

import hw4.src.Model.Department;
import hw4.src.Model.Faculty;
import hw4.src.Model.Human;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(List<Department> departments, String facultyName, Human facultyHead) {
        Faculty newFaculty = new Faculty();
        newFaculty.setNameOfFaculty(facultyName);
        newFaculty.setHeadOfFaculty(facultyHead);
        newFaculty.setDepartments(departments);
        return newFaculty;
    }
}
