package exercises.ex07;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex07 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex07 example07 = new ex07();

        String lengthFunc = example07.inputLength();
        String widthFunc = example07.inputWidth();

        int convertStrInt1 = example07.strInt1(lengthFunc);
        int convertStrInt2 = example07.strInt2(widthFunc);

        String dimen = example07.outputDimen(convertStrInt1, convertStrInt2);
        example07.printDimen(dimen);

        int areaFeet = example07.ftArea(convertStrInt1, convertStrInt2);
        double areaMeters = example07.metArea(areaFeet);

        //Output
        String outputString = example07.outputString(areaFeet, areaMeters);
        example07.printOutput(outputString);

    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private String outputString(int areaFeet, double areaMeters) {
        return "The area is\n" +
                areaFeet+ " square feet\n" +
                areaMeters +" square meters";
    }

    private double metArea(int areaFeet) {
        double meters = areaFeet * 0.09290304;
        meters = (double)Math.round(meters*1000)/1000;
        return meters;
    }

    private int ftArea(int len, int width) {
        return len * width;
    }

    private void printDimen(String dimen) {
        System.out.println(dimen);
    }

    private String outputDimen(int len, int width) {
        return "You entered dimensions of " + len + " feet by " + width + " feet.";
    }

    private int strInt2(String width) {
        int wid = Integer.parseInt(width);
        return wid;
    }

    private int strInt1(String length) {
        int len = Integer.parseInt(length);
        return len;
    }

    private String inputWidth() {
        System.out.print("What is the width of the room in feet? ");
        String width = in.nextLine();
        return width;
    }

    private String inputLength() {
        System.out.print("What is the length of the room in feet? ");
        String length = in.nextLine();
        return length;
    }
}
