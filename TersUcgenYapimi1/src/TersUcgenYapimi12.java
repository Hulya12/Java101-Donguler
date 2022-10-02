import java.util.Scanner;

public class TersUcgenYapimi12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Lütfen bir n değeri giriniz : ");
        n = input.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = ((2 * i) - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
