import java.util.Scanner;

public class MukemmelSayiHesaplama1 {
    public static void main(String[] args) {
        // Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        //kendisine eşit olan sayıya mükemmel sayı denir.

        Scanner input = new Scanner(System.in);
        int n;
        int toplam = 0;

        System.out.print("Lütfen bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == 0) {
            System.out.print( n + "Mükemmel sayı değildir.");
        }else if(toplam == n){
            System.out.print( n+ "Mükemmel sayıdır. ");
        }else{
            System.out.println( n + "Mükemmel sayı değildir. ");
        }
    }

}