import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Java ile girilen sayının harmonik serisini bulan program yazacağız.

        System.out.print("Lütfen n sayısını giriniz : ");

        int n = input.nextInt();

        double result = 0.0;

        for(double i = 1 ; i<=n ; i++){
            result = (1/i);
            result++;

        }

        System.out.print("SONUCUNUZ : "+result);
    }
}
