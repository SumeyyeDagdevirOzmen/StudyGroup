package CollectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue01 {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("HTML");
        pq.add("CCS");
        pq.add("BOOTSTRAP");
        pq.add("JAVASCRIPT");
        System.out.println(pq);

        for(String w:pq){
            System.out.print(w+" ");
        }
        //Iterator: Kendine ait bazi methodlar var.(hasNext,next.previousNext)

        System.out.println();
        Iterator iterator = pq.iterator();

        while(iterator.hasNext())
        System.out.print(iterator.next()+" ");
    }
    /*
    Interview: display all arrayList elements at once on the console?
    I can use sets to get unique elements
    I can also loop through to give unique elements
    How much would you rate yourself out 10 in Java?
    I know Core Java
    String manipulations
    Data structures(Collections and Maps)
    OOP Concept
    Exceptions
*/

}
