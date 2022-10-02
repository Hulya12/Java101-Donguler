import java.util.Scanner;
public class MinMaxDegerBulma {
    public static void main(String[] args) {

        int minSayi=0,maxSayi=0,sayi,n;

        Scanner inp =new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n=inp.nextInt();

        for(int i=1;    i<=n;    i++){
            System.out.print(i+". Sayıyı giriniz : ");
            sayi=inp.nextInt();

            if(i == 1){
                minSayi=sayi;
                maxSayi=sayi;
            }
            if(sayi<minSayi){
                minSayi=sayi;
            }if(sayi>maxSayi) {
                maxSayi=sayi;
            }
        }
        System.out.println("Min: "+minSayi);
        System.out.println("Max: "+maxSayi);




    }
}