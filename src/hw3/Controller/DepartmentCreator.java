package hw3.Controller;
import hw3.Model.Group;
import hw3.Model.Human;
import hw3.Model.Department;

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
