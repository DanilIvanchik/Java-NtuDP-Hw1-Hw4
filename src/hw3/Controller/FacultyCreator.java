package hw3.Controller;

import hw3.Model.Faculty;
import hw3.Model.Human;
import hw3.Model.Department;

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
