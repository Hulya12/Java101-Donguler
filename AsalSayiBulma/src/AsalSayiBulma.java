
public class AsalSayiBulma {
    public static void main(String[] args) {


        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        int a,b;
        boolean sayi;
        for(a = 2 ; a<=100 ; a++ ){
            sayi = true;
            for(b = 2 ; b<a ; b++ ){

                if (a%b==0){
                    sayi = false;
                    break;
                }

            }
            if(sayi){
                System.out.print(a+"-");
            }

        }
    }
}
