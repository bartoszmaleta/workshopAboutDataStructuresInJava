package arrayListExample;

import java.util.Scanner    ;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit) {
            printMenu();
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
            case 0:
                printMenu();
                break;
                
            case 1:
                groceryList.printGroceryList();
                break;

            case 2:
                addItem();
                break;

            case 3:
                // removeItem();
                break;

            case 8:
                quit = true;
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.print("\n Press ");
        System.out.print("\n 0 - To print choice options.");
        System.out.print("\n 1 - To print the list of grocery items.");
        System.out.print("\n 2 - To add an item to the list.");
        System.out.print("\n 8 - To quit the application.");
    }

    private static void addItem() {
        System.out.println("Please enter grocery item: ");
        String itemToAdd = scanner.nextLine();
        groceryList.addGroceryItem(itemToAdd);
    }

    private static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber - 1);
    }

}