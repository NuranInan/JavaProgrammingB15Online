package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = blabla.nextLine();
        System.out.println("your name is : "+ name);

        System.out.println("What is your age?");
        int age = blabla.nextInt();
        System.out.println("your name is : "+ age);
        //String age = blabla.nextLine();
        //norice we are not storing this into variable
        //we just want below line to capture ENTER keyboard input
        // so that it soes not accidentally get captured by
        // the nextline we use to capture address

        blabla.nextLine();

        System.out.println("What is your adress?");
        String adress = blabla.nextLine();
        System.out.println("your adress is : "+ adress);
    }
}
