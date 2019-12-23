package day05;

import java.util.Scanner;

public class WageConverter {
    /*Task 4 :
            *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
    assume that he works 2080 hour for a year.
     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("How much your hourly wage?");
        int hourlyWage= scan.nextInt();
        int yearlySalary = hourlyWage*5*8*4*12;
        System.out.println("your yearly salary is : " + "$" +yearlySalary);






    }
}
