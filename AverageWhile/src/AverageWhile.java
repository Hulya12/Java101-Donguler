
import java.util.Scanner;

public class AverageWhile {
    public static void main(String[] args) {
        int a,toplamdeger=0,verisayisi=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        a = input.nextInt();

        int b=0;

        while ((b>=0)&&(b<=a)){
            b++;
            if (((b%3) == 0) && (b%4==0)) {
                System.out.print( b+" ");
                continue;

            }
            toplamdeger+=b;
            verisayisi++;

        }
        System.out.println("Ortalamanız : "+(toplamdeger/verisayisi));
    }
}
