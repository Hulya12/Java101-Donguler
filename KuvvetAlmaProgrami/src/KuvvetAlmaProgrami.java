import java.util.Scanner;

public class KuvvetAlmaProgrami {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n , r;
        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz : ");
        n = input.nextInt();

        System.out.print("Lütfen Üssü Giriniz : ");
        r = input.nextInt();

        int  toplam = 1 ;

        for(int i=1 ; i<=r ; i++ ){
            toplam=toplam*n;
        }

        System.out.print("Sonucunuz : "+toplam);



    }
}
