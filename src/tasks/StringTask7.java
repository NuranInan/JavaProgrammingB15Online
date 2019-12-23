package tasks;

import java.util.Scanner;

public class StringTask7 {


        /*
        Task 7:
        Ask user to enter valid email address
        for example:
        JSnow@NightWhatch.com or
        Arya@KingsSanding.edu
        print 3 part of the email separately
        for example:
        Part 1->JSnow Part 2-> NightWatch Part 3-> com
        Part 1->Arya  Part2 -> KingsLanding Part 3-> edu
        */

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter valid email address");

            String email = scanner.next();

            int indexOfAtSign = email.indexOf("@");
            String part1 = email.substring(0, indexOfAtSign);
            System.out.println("part1 = " + part1);


            int indexOfDot = email.indexOf(".");
            String part2 = email.substring(indexOfAtSign +1 ,indexOfDot);
            System.out.println("part2 = " + part2);

            String part3 = email.substring(indexOfDot+1);
            System.out.println("part3 = " + part3);
    }
}
