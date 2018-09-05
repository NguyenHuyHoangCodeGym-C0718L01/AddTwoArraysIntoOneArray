package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array1: ");
        int a = scanner.nextInt();
        array1 = inputSizeArray(a);

        System.out.println();

        System.out.println("Input the element of array1: ");
        array1 = inputElement(array1);

        System.out.println();

        System.out.println("Display the array1: ");
        outputArray(array1);

        System.out.println();

        int[][] array2;
        System.out.print("Input the size of array2: ");
        int b = scanner.nextInt();
        array2 = inputSizeArray(b);

        System.out.println();

        System.out.println("Input the element of array2: ");
        array2 = inputElement(array2);

        System.out.println();

        System.out.println("Display the array2: ");
        outputArray(array2);

        System.out.println();

        int[][] array3;
        array3 = sumTwoArrays(array1, array2);
        System.out.println("Display sum array: ");
        outputArray(array3);
    }

    public static int[][] inputSizeArray(int a){
        return new int[a][a];
    }

    public static int[][] inputElement(int[][] array){
        for(int row = 0; row <array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.print("Input element at row: "+row+" column: "+column+" : ");
                Scanner scanner = new Scanner(System.in);
                array[row][column] = scanner.nextInt();
                System.out.println();
            }
        }
        return array;
    }

    public static boolean outputArray(int[][] array){
        if(array != null) {
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[row].length; column++) {
                    System.out.print("Element at row: " + row + " column: " + column + " : " + array[row][column]+" ");
                }
                System.out.println();
            }
            return true;
        }else {
            System.out.println("Array is null");
            return false;
        }
    }

    public static int[][] sumTwoArrays(int[][] a, int[][] b){
        int[][] array = new int[a.length][b.length];
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                array[row][column] = a[row][column] + b[row][column];
            }
        }
        return array;
    }
}
