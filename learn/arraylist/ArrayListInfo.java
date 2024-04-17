package learn.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    GroceryItem(String name) {
        this(name, "food", 1);
    }
}


public class ArrayListInfo {
    public static void main(String[] args) {
        ArrayList groceryItem = new ArrayList();
        groceryItem.add(new GroceryItem("Milk", "food", 1));
        groceryItem.add(new GroceryItem("Sugar", "food", 1));
        groceryItem.add("tea");

        //how to add only specific object
        ArrayList<GroceryItem> grocery = new ArrayList<>();
        grocery.add(new GroceryItem("Milk", "food", 1));
        grocery.add(new GroceryItem("Sugar", "food", 1));
        // grocery.add("tea"); //this one fails because array list expect only GroceryItem
        grocery.add(new GroceryItem("Tea", "food", 1));
        System.out.println(grocery);
    }
}
