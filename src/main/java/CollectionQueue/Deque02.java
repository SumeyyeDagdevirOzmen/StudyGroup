package CollectionQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeSet;

public class Deque02 {
    public static void main(String[] args) {
        //Verilen listede 10 dan buyuk olan elemanlari ekranda yaziniz.
       // rate:Oran
        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(24);
        numbers.add(2);
        System.out.println(numbers);
        Deque<Integer> newList= new LinkedList<>();

        for(Integer w:numbers){
            if(w>10){
                newList.add(w);
            }
        }
        System.out.println(newList);
        TreeSet treeSet = new TreeSet(numbers);
      //  treeSet.addAll(numbers);
        System.out.println(treeSet);//[2, 8, 12, 23, 24] tekrarsiz siralama yapti
    }
}
