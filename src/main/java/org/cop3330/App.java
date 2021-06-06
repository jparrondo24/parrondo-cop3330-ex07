/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    static final double CONVERSION_FACTOR = 0.09290304;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = in.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = in.nextInt();
        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);

        int squareFeet = length * width;
        double squareMeters = squareFeet * CONVERSION_FACTOR;

        System.out.println("The area is");
        System.out.printf("%d square feet\n", squareFeet);
        System.out.printf("%.3f square meters\n", squareMeters);
    }
}
