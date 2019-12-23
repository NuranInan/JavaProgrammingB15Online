package repl_it;

import java.util.Scanner;

public class Repl_34 {

        public static void main(String[] args) {
            //ENTER CODE HERE
            int itemPrice;
            int quarters, dimes, nickels;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter price in cents:");
            itemPrice = scan.nextInt();

            if(itemPrice < 25 || itemPrice > 100 ) {
                System.out.println("Invalid price!");
            } else if(itemPrice % 5 == 1) {
                System.out.println("Invalid price!");
            } else {
                //  System.out.println();
                int change = 100 - itemPrice;
                //  System.out.println("change is: " + change);
                quarters = (100 - itemPrice) / 25;
                //  System.out.println("quarters: " + quarters);
                dimes = ((100 - itemPrice) % 25) /10;
                //   System.out.println("dimes is: " + dimes);
                nickels = (((100 - itemPrice) % 25) %10)/5;
                //      System.out.println("nickels are: "+ nickels);
                System.out.println("Your change is "+ quarters + " quarters, "+ dimes+ " dimes, and "
                        + nickels+ " nickels.");

            }


        }
    }

