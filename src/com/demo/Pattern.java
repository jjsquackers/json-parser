package com.demo;

public class Pattern {

    public static void execute() {

        int size = 10;
        String array[][] = new String[size][size];

        //PATTERN

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 5) {
                    array[i][j] = "*";
                } else {
                    array[i][j] = "-";
                }
            }
        }

        // FOR DISPLAY

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j-1 == array.length) {
                    System.out.println("");
                } else {
                    System.out.print(array[i][j]);
                }

            }
        }
    }
}
