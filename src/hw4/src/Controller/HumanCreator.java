package hw4.src.Controller;

import hw4.src.Model.Human;

public class HumanCreator {
    public Human createHuman(String firstname, String lastname, String middleName, String sex) {
        Human newHuman = new Human();
        newHuman.setFirstname(firstname);
        newHuman.setLastname(lastname);
        newHuman.setMiddleName(middleName);
        newHuman.setSex(sex);
        return newHuman;
    }
}
