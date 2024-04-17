package learn.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] groceries = {"Milk", "Sugar", "Tea"};
        List list = List.of(groceries);
        System.out.println(list);

        //Adding list to ArrayList
        ArrayList<String> groceryList = new ArrayList<String>(list);
        groceryList.add("Ginger");
        System.out.println(groceryList);

        //Adding list with constructor
        ArrayList<String> fruitsList = new ArrayList<String>(List.of("Oranges", "Apples", "Banana"));
        fruitsList.addAll(groceryList);
        System.out.println(fruitsList);

        //Adding Arrays instance
        ArrayList veggiList = new ArrayList<>(Arrays.asList("tomotto", "onion", "chilli"));
        System.out.println(veggiList);

        //get index
        ArrayList combined = new ArrayList();
        combined.addAll(veggiList);
        combined.addAll(fruitsList);
        System.out.println(combined);

        //get item by index
        System.out.println("0th Item = " + combined.get(0));

        //check item exist item by name
        System.out.println("by Name Item = " + combined.contains("Apples"));

        //index of an item
        System.out.println("Index of Banana = " + combined.indexOf("Banana"));

        //last index of
        System.out.println("Last Index of Banana = " + combined.lastIndexOf("Banana"));

        //sort
        System.out.println("Before Sort " + combined);
        combined.sort(Comparator.naturalOrder());
        System.out.println("After Sort " + combined);
    }
}
