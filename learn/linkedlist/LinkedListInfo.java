package learn.linkedlist;

import java.util.LinkedList;

public class LinkedListInfo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();
        placeToVisit.add("Delhi");

        addItem(placeToVisit);
        System.out.println(placeToVisit);

        removeItem(placeToVisit);
    }

    private static void addItem(LinkedList<String> list) {
        list.add(0, "Melborne");
        list.addFirst("Mumbai");
        list.addLast("Hydrabad");

        //Queue methods
        list.offer("Chennai");
        list.offerFirst("Madurai");
        list.offerLast("Trichy");

        //stack methods
        list.push("Theni");
    }

    private static void removeItem(LinkedList<String> list) {
        System.out.println("List: = " + list);
        var s1 = list.remove();
        System.out.println("Removed s1 = " + s1);

        var s2 = list.removeFirst();
        System.out.println("Removed s2 = " + s2);

        var s3 = list.removeLast();
        System.out.println("Removed s3 = " + s3);

        var s4 = list.poll();
        System.out.println("Removed s4 = " + s4);

        var s5 = list.pop();
        System.out.println("Removed s5 = " + s5);

        System.out.println("List = " + list);
    }
}
