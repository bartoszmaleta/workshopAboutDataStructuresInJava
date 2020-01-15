package arrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    // ----------------------- 2
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // first option
        int[] myIntArray = new int[10];
        System.out.println(Arrays.toString(myIntArray));

        // second option
        int[] myIntArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // third option
        int[] myIntArray3 = new int[10];
        for (int i = 0; i < myIntArray3.length; i++) { // better to use length!
            myIntArray3[i] = i * 10;
        }

        // printing array version 1
        for (int i = 0; i < myIntArray3.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray3[i]);
        }
        // printing array version 2
        for (int i = 0; i < myIntArray3.length; i++) {
            System.out.print(myIntArray3[i]);
        }
        //printing array version 3
        System.out.println();
        System.out.println(Arrays.toString(myIntArray3));
        System.out.println();
        System.out.println("---------------");

        // ----------------------- 2
        int[] myIntegers = getIntegers(5);
        System.out.println("The average is " + getAverarge(myIntegers));
        // printing array version with space
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.print(myIntegers[i] + " ");
        }
        System.out.println();
    }

    // ----------------------- 2
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value: \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverarge(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        double average = sumTotal / array.length;
        return average;
    }


}