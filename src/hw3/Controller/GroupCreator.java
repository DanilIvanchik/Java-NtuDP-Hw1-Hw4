package hw3.Controller;

import hw3.Model.Group;
import hw3.Model.Human;
import hw3.Model.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(List<Student> students, String groupName, Human groupHead) {
        Group newGroup = new Group();
        newGroup.setNameOfGroup(groupName);
        newGroup.setHeadOfGroup(groupHead);
        newGroup.setStudents(students);
        return newGroup;
    }
}
