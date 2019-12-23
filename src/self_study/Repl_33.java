package self_study;

import java.util.Scanner;

public class Repl_33 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");

        double drinks = scanner.nextInt();
        double lethalDoz = 10000.0;
        double count ;

        count= (lethalDoz/drinks);

            System.out.println("It would take about " +count+ " drinks for a lethal overdose." );

    }
}
