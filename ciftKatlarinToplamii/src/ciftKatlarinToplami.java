import java.util.Scanner;

public class ciftKatlarinToplami {
    public static void main(String[] args) {
        int n;
        int toplam = 0;

        Scanner veri=new Scanner(System.in);

        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
        kabul eden ve girilen değerlerden çift ve
        4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.{
         */

        do {
            System.out.print("Lütfen Sayıyı Giriniz : ");
            n = veri.nextInt();
            if((n%4==0)){
                toplam+=n;
            }
        }while (n%2==0);

        System.out.println("Toplam : "+toplam);

    }
}
