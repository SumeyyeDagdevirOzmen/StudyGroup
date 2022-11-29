package static_keyword;

public class Static01 {

    static String  okulIsmi= "Yildiz koleji";
    static String okulTelefonu="3122563635";
    static   String ogrenciIsim="fatih";

    public void nonStaticMethod(){
        System.out.println("non static mehtod");
    }

    public static void staticMethod(){
        System.out.println(" static mehtod");
    }


    public static void main(String[] args) {


        Static01 st = new Static01();
        System.out.println(Static01.okulTelefonu);
        System.out.println(okulIsmi);
        System.out.println(okulTelefonu);
        staticMethod();


    }
}
