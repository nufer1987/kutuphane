import java.util.ArrayList;

public class Main {


   static ArrayList<Kitap> ktpLst=new ArrayList<>();
    public static void main(String[] args) {
        Runner runner=new Runner();

        Kitap ktp=new Kitap("nazım","haluk","1999",1002);
        Kitap ktp2=new Kitap("nazım","haluk","1999",1002);

        ktpLst.add(0,ktp2);
        ktpLst.add(1,ktp);

        System.out.println(ktpLst.get(1).fiyat);

        runner.uygulama();
    }
}
