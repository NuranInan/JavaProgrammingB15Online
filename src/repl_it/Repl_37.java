package repl_it;

import java.util.Scanner;

public class Repl_37 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int numberOfCoupons = scanner.nextInt();
        if(numberOfCoupons>2) {
            int numberOfCandies = numberOfCoupons / 10;
            int remaining = numberOfCoupons - (numberOfCandies * 10);
            int numberOfGumballs = remaining / 3;
            System.out.println("Number of Candies: " + numberOfCandies);
            System.out.println("Number of Gumballs: " + numberOfGumballs);
        }else{
            System.out.println("Not enough coupons");
        }
//Scanner scan=new Scanner(System.in);
//        System.out.println( "Enter number of coupons:");
//        int numberOfCoupons=scan.nextInt();
//        int numberOfCandies=numberOfCoupons/10;
//        int numberOfGamballs=(numberOfCoupons%10)/3;
//        if(numberOfCoupons>=3) {
//            System.out.println("Number of Candies: " + numberOfCandies);
//            System.out.println("Number of Gumballs: " + numberOfGamballs);
//        }else System.out.println("Not enough coupons");
    }


}



