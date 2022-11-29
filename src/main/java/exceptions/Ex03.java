package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
    /*
      Kullanicidan yasini isteyin
      kullanici yas olarak negatif bir sayi,
      0 veya
      120'den buyuk bir sayi girerse illegalArgumentException olusacak sekilde
      bir program yaziniz
      */
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas <=0 || yas >120){
            System.out.println("lutfen gecerli bir yas giriniz");
            throw new IllegalArgumentException("uygun degil");
        }else {
            System.out.println("Uygun yas girdiniz tesskurler");
        }

    }
}
