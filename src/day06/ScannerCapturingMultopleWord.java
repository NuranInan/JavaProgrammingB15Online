package day06;

import java.util.Scanner;

public class ScannerCapturingMultopleWord {
    public static void main(String[] args) {
        Scanner blabla= new Scanner(System.in);

        System.out.println("What is your name ?");
        //nextLine method of Scanner id used to capture whole
        String name = blabla.nextLine();
        System.out.println("you have entered "+name);

        /*
        Task 4
        use nextLine to ask your bio
        whats your name
        which city you livbe in, including state,Tyson, VA
        What is your street address
         */
        System.out.println("What is your gender ?");
        String gender =blabla.nextLine();
        System.out.println("you have entered "+ gender);

        System.out.println("What is your name?");
        String name1= blabla.nextLine();
        System.out.println("you have entered "+name1);

        System.out.println("Which city you live in");
        String city = blabla.nextLine();
        System.out.println("you have entered "+city);

        System.out.println("What is your street address ?");
        String street = blabla.nextLine();
        System.out.println("you have entered "+ street);

    }
}
