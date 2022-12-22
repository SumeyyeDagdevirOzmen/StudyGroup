package lambdapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        kucukTenBuyukYazdir(list);
        list.stream().map(t->t*t*t).filter(t->t%10==5).forEach(Utils::printInSameLine);
        System.out.println();
        System.out.println(kuplerinBesBasYazdir(list));
        System.out.println();
        System.out.println(toplamYazdir(list));


    }
    //S6: listin elemanlarini kucukten buyuge siralayalim.
    public static void kucukTenBuyukYazdir(List<Integer>list){
        list.stream().sorted().forEach(Utils::printInSameLine);
        list.stream().sorted().distinct().forEach(Utils::printInSameLine);//tekrarsiz olanlari veriri
        list.stream().sorted(Comparator.reverseOrder()).forEach(Utils::printInSameLine);
    }
    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static List<Integer> kuplerinBesBasYazdir( List<Integer> l){
        return l.stream().distinct().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }

    public static int toplamYazdir(List<Integer>l){

        // S10 :list elemanlarini toplamini bulalim
        //l.stream().reduce(Integer::sum);
        //System.out.println(list.stream().reduce(0, (a, b) -> a + b));

        return l.stream().reduce(0,(x,y)->x+y);
        //return l.stream().reduce(Integer::sum);
    }


}
