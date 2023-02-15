package org.techreturners;
import java.util.Scanner;
public class Main {
    public static boolean getUserInput() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the Mars Rover Navigation experience.");
        System.out.println("Please enter the dimensions of the plateau, as x and y values (for example 10 10):");
        String dimensions = myScanner.nextLine();
        Plateau plateau = new Plateau(dimensions);
        System.out.println(plateau.getDimensions());
        System.out.println("Please enter the Mars Rover's landing position and the direction it is facing.");
        System.out.println("Please enter in the form x y f. Where f can be either of the following; N for North, E for East, S for South or W for West:");
        String initialPosition = myScanner.nextLine();
        MarsRover marsRover = new MarsRover(initialPosition, plateau);
        System.out.println("Thank you. You will now enter the series of instructions to navigate your Mars Rover.");
        System.out.println("L = turn left, R = turn right and M = move forward one grid square.");
        System.out.println("Please enter your instructions, in the form LMRMMMLMM:");
        String instructions = myScanner.nextLine();
        PlateauPosition finalPosition = marsRover.ParseInstructions(instructions);
        if (finalPosition.getErrorMessage().length() > 0) {
            System.out.println(finalPosition.getErrorMessage());
            return false;

        } else {
            System.out.println("The final position of the Mars Rover is " + (finalPosition.getPlateauPosition()));
            myScanner.close();
            return true;
        }
    }

    public static void main(String[] args) {
        boolean result = getUserInput();
        while (!result) {
            result = getUserInput();
        }
    }



}
