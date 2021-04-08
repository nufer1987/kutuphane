import java.util.ArrayList;
import java.util.Scanner;

public class Kitap {
    public String adi;
    public String yazari;
    public String yili;
    public int fiyat;
    public static int syc=1001;

    public Kitap() {
    }

    public Kitap(String adi, String yazari, String yili, int fiyat) {

        this.adi = adi;
        this.yazari = yazari;
        this.yili = yili;
        this.fiyat = fiyat;
    }





    public void  kitapekle(){

        Scanner a=new Scanner(System.in);
        System.out.println("kitap adı");
        String b=a.nextLine();
        System.out.println("kitap yazar");
        String c=a.nextLine();
        System.out.println("kitap uılı");
        String d=a.nextLine();
        System.out.println("fıyat");
        int f=a.nextInt();
        Kitap ktp3=new Kitap(b,c,d,f);
        Main.ktpLst.add(2,ktp3);
        syc++;

    }
    public static void kitapSil(){

        Scanner b=new Scanner(System.in);
        System.out.println("silmek istenilen kitap no= ");
        int c=b.nextInt();
       Main.ktpLst.remove(c-1001);
        System.out.println(c +" sayilli kitap silindi ");


    }
    public void kitapAra(){

        Scanner c=new Scanner(System.in);
        System.out.println("aramak istenilen kitap no= ");
        System.out.println(Main.ktpLst.get(c.nextInt()-1001));

    }
    public void kitapGor(){

        for(int i = 0; i< Main.ktpLst.size(); i++){
            System.out.println(Main.ktpLst.toString());
        }System.out.println("toplam " + Main.ktpLst.size());

    }
    public void giris(){
        String islemler="=====KITAP PROGRAMI======\n"
                + "1:kitap ekleme\n"
                + "2:numara ile kitap sil\n"
                + "3:numara ile kitap ara\n"
                + "4:tumunu listele\n"
                + "5:cikis";
        System.out.println(islemler);
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", yili='" + yili + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
