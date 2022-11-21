package hw4.src;

import hw4.src.Controller.TypicalUniversityCreator;

import java.util.Scanner;

public class Run {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        TypicalUniversityCreator myTypicalUniversity = new TypicalUniversityCreator();
        myTypicalUniversity.createTypicalUniversity();

    }
    }