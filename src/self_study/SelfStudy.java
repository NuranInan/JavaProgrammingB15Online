package self_study;

import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args) {

        /*
        Create an object of Scanner class named scanner.
Create int variable named day.
Write an if statement that will print day of the week based on value of the day variable.


For example:

if day = 1, then print "It's a Monday!"
or, if day = 5, then print "It's a Friday!"

Otherwise (else), print "There is no such a day!"

#################################################

input: 1
output: It's a Monday!

input: 7
output: It's a Sunday!
         */

        Scanner scanner = new Scanner(System.in);
         int day= scanner.nextInt();
         day=1;
         if(day==1){
             System.out.println("It's a Monday!");
         }else if(day==2){
             System.out.println("It's a Tuesday!");
         }else if(day==3) {
             System.out.println("It's a Wednesday!");
         }else if(day==4) {
             System.out.println("It's a Thursday!");
         }else if(day==5){
             System.out.println("It's a Friday!");
         }else if(day==6){
             System.out.println("It's a Saturday!");
         }else if(day==6) {
             System.out.println("It's a Sunday!");
         }else {
             System.out.println("There is no such a day!");
         }
    }
}