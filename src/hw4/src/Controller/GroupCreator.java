package hw4.src.Controller;

import hw4.src.Model.Group;
import hw4.src.Model.Human;
import hw4.src.Model.Student;

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
