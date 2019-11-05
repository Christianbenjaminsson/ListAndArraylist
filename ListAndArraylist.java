package com.example.listandarraylist;

import java.util.Scanner;

public class ListAndArraylist {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
//    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        boolean quit = false;
        int choise = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choise: ");
            choise = scan.nextInt();
            scan.nextLine();

            switch (choise) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                     removeItem();
                     break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }


//        System.out.println("Enter 10 integers: ");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 integers: ");
//        getInput();
//        printArray(baseData);

    }

//    private static void getInput()
//    {
//        for(int i = 0; i < baseData.length; i ++)
//            baseData[i] = scan.nextInt();
//    }

//    private static void printArray(int[] arr)
//    {
//        for(int i = 0; i < arr.length; i ++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }

//    private static void resizeArray()
//    {
//        int[] original = baseData;

//        baseData = new int[12];
//        for(int i = 0; i < original.length; i ++)
//            baseData[i] = original[i];
//    }
}
