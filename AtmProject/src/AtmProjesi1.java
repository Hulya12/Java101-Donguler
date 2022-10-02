import java.util.Scanner;

public class AtmProjesi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password, userName;
        int right = 3, toplamPara = 10000, paraTutari = 0, select;

        while (right > 0){
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
            userName = input.nextLine();

            System.out.print("Lütfen Şifrenizi Giriniz : ");
            password = input.nextLine();

            if (userName.equals("Yazılım") && (password.equals("Java456"))) {
                System.out.println("Hoşgeldiniz!");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1)Para Çekme\n" +
                            "2)Para Yatırma\n" +
                            "3)Bakiye Sorgulama\n" +
                            "4)Çıkış Yapma\n");

                    select = input.nextInt();
                    switch (select) {

                        case 1:
                            System.out.print("Para Miktarı : ");
                            paraTutari = input.nextInt();
                            if (paraTutari > toplamPara) {
                                System.out.println("Bakiye Yetersiz!");
                            } else {
                                toplamPara -= paraTutari;
                                System.out.println("Yeni Bakiyeniz : " + toplamPara);
                            }
                            break;

                        case 2:
                            System.out.println("Para Miktarı : ");
                            paraTutari = input.nextInt();
                            toplamPara = paraTutari + toplamPara;
                            System.out.println("Yeni Bakiyeniz : " + toplamPara);

                            break;


                        case 3:
                            System.out.println("Para Miktarı : " + toplamPara);

                            break;


                    }


                } while (select != 4);
                System.out.println("İyi günler.Yine bekleriz...");


            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre Girdiniz!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur!");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }
        }
    }
}