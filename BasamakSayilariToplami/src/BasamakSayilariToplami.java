import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args){

        // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        //Aşağıda tanımladığımız numberCunter bu döngünün ne kadar devam edeceğini belirtmek için kullanılır.

        Scanner veri = new Scanner(System.in);
        int n;
        int basamakSayisi = 0 , toplam = 0;

        System.out.print("Lütfen Hesaplanmasını istediğiniz sayıyı giriniz : ");
        n = veri.nextInt();

        while( n!= 0){
            toplam+=(n%10);
            n=n/10;
            basamakSayisi++;

        }
        System.out.println("Basamak Sayısı : "+basamakSayisi);

        System.out.println("Basamak Toplamı : "+toplam);

    }
}
