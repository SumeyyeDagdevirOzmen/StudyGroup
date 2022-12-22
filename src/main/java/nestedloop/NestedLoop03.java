package nestedloop;

public class NestedLoop03 {
    public static void main(String[] args) {

        /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
         */
        int input=5;
        for (int line = 1; line <=input ; line++) {
            for (int j = 1; j <=(-1*line+5) ; j++) {
                System.out.print("*"+" ");
            }
            for (int i = 1; i <=line ; i++) {
                System.out.print("."+" ");
            }
            System.out.println();
        }

    }
}
