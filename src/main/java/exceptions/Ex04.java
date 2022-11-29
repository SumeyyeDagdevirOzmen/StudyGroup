package exceptions;

public class Ex04 {

    public static void main(String[] args) {
        String s = "Hello!";

        getCharacterFromAString(s,10);
        dividedThelength(s,3,4,3);
    }

    public static void getCharacterFromAString(String str,int idx){

        try {
            System.out.println(str.charAt(idx));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index String' te yok===>"+e.getMessage());
        }
    }

    public static void  dividedThelength(String str,int idx1,int idx2,int idx3){

        try {
            int firsttlenght= str.substring(idx1,idx2).length();
            int secondlenght= str.substring(idx1,idx3).length();
            System.out.println(firsttlenght/secondlenght);

        }catch (ArithmeticException e){
            System.out.println("bolme yaparken hata oldu==> " +e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index String te yok==> "+e.getMessage());
        }
    }
}
