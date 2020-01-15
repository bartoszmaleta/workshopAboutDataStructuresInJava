package arrayListExample;

import java.util.ArrayList;
import java.util.List;

public class CreateMyFirstArray {
    public static void main(String[] args) {
        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals);

        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        // Creating an ArrayList from another collection

        List<Integer> secondArrayList = new ArrayList<>(firstFivePrimeNumbers);
        System.out.println(secondArrayList);
        secondArrayList.add(1234234);
        System.out.println(secondArrayList);
        System.out.println(secondArrayList.size());
        System.out.println(secondArrayList.get(2));
        System.out.println(secondArrayList.get(secondArrayList.size() - 1));
        secondArrayList.set(3, 444444);

        // Remove the element at index `5`
        secondArrayList.remove(3);

        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i = 0; i < secondArrayList.size(); i++) {
            System.out.println(secondArrayList.get(i));
        }

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

        // OPTION TO CONVERT ARRAYLIST:
        String[] namesArray = names.toArray(new String[names.size()]);
    }
}