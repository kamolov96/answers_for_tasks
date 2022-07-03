package uz.home;

import java.util.Scanner;

public class Task1 {

    private static final Scanner SCANNER_NUM = new Scanner(System.in);

    public static void main(String[] args) {
        byte length = 7;
        System.out.println("Enter the place number 1: ");

        byte rowNumber = -1, colNumber = -1;

        do {
            System.out.printf("row number (1..%d): ", length);
            rowNumber = SCANNER_NUM.nextByte();
        } while (rowNumber < 1 || rowNumber > length);

        do {
            System.out.printf("column number (1..%d): ", length);
            colNumber = SCANNER_NUM.nextByte();
        } while (colNumber < 1 || colNumber > length);

        rowNumber--;
        colNumber--;

        byte centerX = (byte) (length / 2), centerY = centerX;

        byte result = (byte)(Math.abs(rowNumber-centerX)+Math.abs(colNumber-centerY));
        System.out.println("Result: "+result);

    }
}
