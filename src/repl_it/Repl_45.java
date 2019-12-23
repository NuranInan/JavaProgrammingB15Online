package repl_it;

import java.util.Scanner;

public class Repl_45 {


    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int vehichleYear;

     System.out.println("Enter vehicle's year:");
     vehichleYear =scan.nextInt();

     if(vehichleYear>= 1995 && vehichleYear<=1998){
         System.out.println("Your vehicle needs to be recalled!");

     }else if(vehichleYear>= 2001 && vehichleYear<=2002) {
         System.out.println("Your vehicle needs to be recalled!");

     }else if(vehichleYear>= 2004 && vehichleYear<=2006){
             System.out.println("Your vehicle needs to be recalled!");

     }else if(vehichleYear>= 2015 && vehichleYear<=2017) {
         System.out.println("Your vehicle needs to be recalled!");
     }else{
         System.out.println("Your vehicle is fine, enjoy!");
     }
    }
}
