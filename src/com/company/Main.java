package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı adınz : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.print("Giriş yaptınız!\nTekelioğlu banka hoşgeidiniz sayın \"patika\" ");

                do {

                    System.out.println("\n1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Kart iade cd-rom'dam kartınızı alınız");
                    System.out.print("Lütfen yapmak istediginiz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Yatırılacak tutar : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekilecek Tutar : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance + "$");
                            break;
                        case 4:
                            System.out.println("Tekelioğlu bankı seçtiginiz için teşekkürler \n Tekrar görürmek üzere..");
                            break;
                        default:
                            break;

                    }
                }while (select !=4);
                System.out.println("Tekelioğlu bankı seçtiginiz için teşekkürler \n Tekrar görürmek üzere..");
                break;

            } else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. \nLütfen banka ile iletişime geçiniz. ");

                }else {
                    System.out.println("Kalan giriş hakkınız : " + right);
                }
                    /*
                    if (select == 1){
                        System.out.print("Yatırılacak tutar : ");
                        int price = input.nextInt();
                        balance += price;
                    }else if (select == 2){
                        System.out.println("Çekilecek Tutar : ");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Yetersiz bakiye!");
                        }else {
                            balance -= price;
                        }
                    }else if (select == 3){
                        System.out.println("Bakiyeniz : " + balance);
                    }
                }while (select !=4);
                System.out.println("Tekelioğlu bankı seçtiginiz için teşekkürler \n Tekrar görürmek üzere..");
                break;

            } else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. \nLütfen banka ile iletişime geçiniz. ");

                }else {
                    System.out.println("Kalan giriş hakkınız : " + right);
                }
                */



            }
        }










    }
}
