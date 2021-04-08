import java.util.Scanner;

public class Runner  {
    Kitap kitap = new Kitap();



    public void uygulama(){

        Scanner scan = new Scanner(System.in);

      kitap.giris();
        int result = scan.nextInt();

            switch (result) {
                case 1:
                    kitap.kitapekle();
                    break;
                case 2:
                    kitap.kitapSil();
                    break;
                case 3:
                    kitap.kitapAra();
                    break;
                case 4:
                    kitap.kitapGor();
                    break;
                case 5:
                    System.out.println("uygulamadan cikiliyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("yanlis secim yaptiniz..");
                    kitap.giris();

            }uygulama();

}
        }

