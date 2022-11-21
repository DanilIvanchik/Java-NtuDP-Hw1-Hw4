package hw3;

import hw3.Controller.TypicalUniversityCreator;

import java.util.Scanner;

public class Run {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        TypicalUniversityCreator myTypicalUniversity = new TypicalUniversityCreator();
        myTypicalUniversity.createTypicalUniversity();

    }
    }