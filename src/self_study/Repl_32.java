package self_study;

import java.util.Scanner;

public class Repl_32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds: ");

        int inputSeconds, hours, minutes, seconds;

        inputSeconds = scanner.nextInt();

        hours=1;
        minutes=20;
        seconds=10;

       hours = inputSeconds / 3600;
       minutes = (inputSeconds/60) % 60;
       seconds = inputSeconds % 60;


        System.out.println( hours + " hours, "+minutes+" minutes, "+seconds+" seconds");


    }
}
