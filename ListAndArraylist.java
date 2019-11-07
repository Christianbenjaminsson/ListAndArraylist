package com.example.listandarraylist;

import java.util.ArrayList;
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
            System.out.print("\nEnter your choise: ");
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
                    processArrayList();
                case 7:
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

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choise options.");
        System.out.println("\t1 - To print the list of grocery items.");
        System.out.println("\t2 - To add an item to the list.");
        System.out.println("\t3 - To modify an item int the list.");
        System.out.println("\t4 - To remove an item from the list.");
        System.out.println("\t5 - To search for an item in the list.");
        System.out.println("\t6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name: ");
        String itemNo = scan.nextLine();
        System.out.println("Enter replacement name: ");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        String itemNo = scan.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scan.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
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
