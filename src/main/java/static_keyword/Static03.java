package static_keyword;

public class Static03 {
    String isim;

    int id;

    static String okulIsimi;

    static int counter = 0;


    public int setId(){
        counter++;
        return counter;
    }

    public Static03(String isim){
        this.isim=isim;
        this.id=setId();
    }

    public static void setOkulIsimi(String isim){
        okulIsimi=isim;
    }

    public void getStudentInfo(){

        System.out.println("Ogrenci Id :"+id);
        System.out.println("Ogreni isimi :"+isim);
        System.out.println("Okul ismi :"+okulIsimi);
    }

    public static void main(String[] args) {

        Static03.setOkulIsimi("Galaksi okulu");
        Static03 s1=new Static03("Kadir Karatas");
        Static03 s2=new Static03(" Sumeyye");
        Static03 s3=new Static03("Fatma ");
        Static03 s4=new Static03("Fatma ");
        s1.getStudentInfo();
        s2.getStudentInfo();
        s3.getStudentInfo();
        s4.getStudentInfo();

    }


}

