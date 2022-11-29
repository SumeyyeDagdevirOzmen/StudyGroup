package exceptions;

public class Ex02 {

    public static void main(String[] args) {

        String arr[]={"Ali","Can","Veli","Han"};

        // System.out.println(arr[10]);
        getAnElementFromArray(arr,1);
        getAnElementFromArray(arr,10);
    }
    public static void getAnElementFromArray(String arr[],int idx){

        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("olmayan index girdiniz" +e.getMessage());
        }


    }
}
