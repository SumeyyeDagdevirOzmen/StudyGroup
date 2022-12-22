package CollectionQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {


    Queue<String> languages1 = new LinkedList<>();
    // insert element to the ArrayList
        languages1.add("JavaScript");
        languages1.add("Python");
        languages1.add("Java");
        System.out.println("LinkedList 1: " + languages1);
    // create another ArrayList
    LinkedList<String> languages2 = new LinkedList<>();
    // add elements to ArrayList
        languages2.add("English");
        languages2.add("Java");
        languages2.add("Python");
        System.out.println("LinkedList 2: " + languages2);
//        System.out.println(languages1.retainAll(languages2));//kesisen kumedeki elemanlar gibi
//        System.out.println(languages1);
        System.out.println(languages2.retainAll(languages1));
        System.out.println(languages2);

}
}