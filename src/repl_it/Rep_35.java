package repl_it;

import java.util.Scanner;

public class Rep_35 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();


        String list = "smartphone,laptop, charger, usbCable, headphones, pants, hat, socks, blanket, pillow";


        int smartPhonePrice = 300;
        int laptopPrice = 400;
        int chargerPrice = 15;
        int usbCablePrice = 10;
        int headphonesPrice = 30;
        int pantsPrice = 50;
        int hatPrice = 25;
        int socksPrice =5;
        int blanketPrice = 60;
        int pillowPrice = 40;


        int giftCardAmount = 100;
        int leftoverBalance= 0;




                if(item.equals("smartphone")){
                    System.out.println("Sorry, not enough funds on your card!");

                }else if(item.equals("laptop")){
                    System.out.println("Sorry, not enough funds on your card!");

                }else if(item.equals("charger")) {
                leftoverBalance = giftCardAmount - chargerPrice;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is:" + leftoverBalance);

                } else if(item.equals("usbCable")){
                leftoverBalance= giftCardAmount-usbCablePrice;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is:"+ leftoverBalance);

                } else if(item.equals("headphones")) {
                leftoverBalance = giftCardAmount - headphonesPrice;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is:" + leftoverBalance);

                }else if(item.equals("pants")){
                leftoverBalance= giftCardAmount-pantsPrice;
                    System.out.println("Your current balance is:"+ leftoverBalance);

                }else if(item.equals("hat")){
                leftoverBalance= giftCardAmount-hatPrice;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is:"+ leftoverBalance);

                }else if(item.equals("socks")){
                leftoverBalance= giftCardAmount-socksPrice;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is:"+ leftoverBalance);

                }else if(item.equals("blanket")){
                leftoverBalance= giftCardAmount-blanketPrice;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is:"+ leftoverBalance);

                }else if(item.equals("pillow")) {
                    leftoverBalance = giftCardAmount - pillowPrice;
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is:" + leftoverBalance);

                }else {
                    System.out.println("Invalid item!");
            }
    }
}

