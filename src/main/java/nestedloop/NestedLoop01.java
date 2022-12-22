package nestedloop;

public class NestedLoop01 {
    /*
        soru 1)  Asagidaki sekil cizen kodu yaziniz
                . . . .1
                . . . 2
                . . 3
                . 4
                5
                */
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= (-1 * line + 5); i++) {
                System.out.print("." + " ");
            }
            System.out.println(line);
        }

/*

    Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
         *
                 * *
                 * * *
                 * * * *
                 * * * * *
                 */

        int input =5;

        for (int i=1;i<=input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}