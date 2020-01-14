package linkedListExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]) {
        // Creating myLinkedList of class linked list
        LinkedList<String> myLinkedList = new LinkedList<String>();

        // Adding elements to the linked list
        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.addLast("C");
        myLinkedList.addFirst("D");
        myLinkedList.add(2, "E");
        myLinkedList.add("F");
        myLinkedList.add("G");
        System.out.println("Linked list : " + myLinkedList);
        ArrayList<String> familyFriends = new ArrayList<>();
        familyFriends.add("Andrzej");
        familyFriends.add("Marcin");

        myLinkedList.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + myLinkedList);

        // Removing elements from the linked list
        myLinkedList.remove("B");
        System.out.println("Linked list : " + myLinkedList);
        myLinkedList.remove(3);
        System.out.println("Linked list : " + myLinkedList);
        myLinkedList.removeFirst();
        System.out.println("Linked list : " + myLinkedList);
        myLinkedList.removeLast();
        System.out.println("Linked list after deletion: " + myLinkedList);

        // Finding elements in the linked list
        boolean status = myLinkedList.contains("E");

        if (status)
            System.out.println("List contains the element 'E' ");
        else
            System.out.println("List doesn't contain the element 'E'");

        // Number of elements in the linked list
        int size = myLinkedList.size();
        System.out.println("Size of linked list = " + size);

        // Get and set elements from linked list
        Object element = myLinkedList.get(2);
        System.out.println("Element returned by get() : " + element);
        myLinkedList.set(2, "Y");
        System.out.println("Linked list after change : " + myLinkedList);

        // Getting the first element in the LinkedList using getFirst()
        // The getFirst() method throws NoSuchElementException if the LinkedList is
        // empty
        String firstElement = myLinkedList.getFirst();
        System.out.println("First elemnt : " + firstElement);

        // UNCOMMENT FOR A MOMENT
        // Clear the LinkedList by removing all elements
        // myLinkedList.clear();
        // System.out.println("Cleared the LinkedList => " + myLinkedList);

        // Find the index of the first occurrence of an element in the LinkedList
        myLinkedList.add(2, "Andrzej");
        myLinkedList.add(5, "Andrzej");
        myLinkedList.add(4, "Janek");
        myLinkedList.add(1, "Janek");
        System.out.println("Linked list after change : " + myLinkedList);

        System.out.println("indexOf \"Andrzej\" : " + myLinkedList.indexOf("Andrzej"));
        System.out.println("indexOf \"Janek\" : " + myLinkedList.indexOf("Janek"));

        // Find the index of the last occurrence of an element in the LinkedList
        System.out.println("lastIndexOf \"Andrzej\" : " + myLinkedList.lastIndexOf("Andrzej"));
        System.out.println("lastIndexOf \"Janek\" : " + myLinkedList.lastIndexOf("Janek"));
    }
}