package hw4.src.Controller;

import hw4.src.Model.Department;
import hw4.src.Model.Group;
import hw4.src.Model.Human;

import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(List<Group> groups, String departmentName, Human departmentHead) {
        Department newDepartment = new Department();
        newDepartment.setNameOfDepartment(departmentName);
        newDepartment.setHeadOfDepartment(departmentHead);
        newDepartment.setGroups(groups);
        return newDepartment;
    }
}
