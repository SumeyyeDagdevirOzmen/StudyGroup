package exceptions;

public class Ex01 {
    String s;
    public static int x = 12;
    public static int y = 0;

    public static void main(String[] args) {
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.err.println("Sorry, you can not divide a number by zero " + e.getMessage());
            //Sorry, a number can not be divided by zero.
        }
    }
}
