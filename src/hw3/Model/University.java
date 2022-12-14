package hw3.Model;

import java.util.List;

public class University {
    private String nameOfUniversity;
    private Human headOfUniversity;
    private List<Faculty> faculties;


    public String getHeadOfUniversity() {
        return headOfUniversity.toString();
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public List<Faculty> getFaculties(){
        return faculties;
    }

    public void setHeadOfUniversity(Human headOfDepartment) {
        this.headOfUniversity = headOfDepartment;
    }

    public void setNameOfUniversity(String name) {
        this.nameOfUniversity = name;
    }

    public void setFaculties(List<Faculty> faculties) {this.faculties = faculties;}

    public String toString() {
        return "\nUniversity name: " + nameOfUniversity + "\nHead of university: " + headOfUniversity + "\nFaculties: " + getFaculties();
    }
}
