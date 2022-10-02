import java.util.Scanner;

public class KombinasyonHesaplamaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kombinasyon formülü : C(n,r) = n! / (r! * (n-r)!)

        int n,r;
        int total1=1 , total2=1 , total3=1;

        System.out.print("Lütfen n değerini giriniz : ");
        n=input.nextInt();

        System.out.print("Lütfen r değerini giriniz : ");
        r= input.nextInt();

        for(int i=1 ; i<=n ; i++){
            total1=total1*i;
        }
        for(int i=1 ; i<=r ; i++){
            total2=total2*i;
        }
        for( int i=1 ; i<=(n-r) ; i++){
            total3=total3*i;
        }
        System.out.print( "SONUCUNUZ : " +total1/(total2*total3));

    }

}
