import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        //Java döngüler ile fibonacci serisi bulan program yazıyoruz.
        // Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen eleman sayısını giriniz : ");
        int sayi = input.nextInt();

        int n1 = 0 , n2 = 1;
        System.out.print(n1+" "+n2 + " ");
        for(int i = 1 ; i<=(sayi-2) ; i++){
            int result = n1+n2;
            System.out.print(result + " ");
            n1 = n2;
            n2 = result;

        }
    }
}