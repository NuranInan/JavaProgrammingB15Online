package self_study;

import java.util.Scanner;

public class OrnekWageConverter {

    public static void main(String[] args) {


        double withholdings;
        double netPay;
        double grossPay;
        double hourlyWage;
        double hoursWorked;

        System.out.println("Please enter your name ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("Please enter hourly wage: $");
        hourlyWage = input.nextDouble();
        System.out.println("Please enter how many hours you worked  ");
        hoursWorked = input.nextDouble();

        grossPay = (hourlyWage * hoursWorked);
        System.out.println("Gross pay for this week is " + grossPay);

        withholdings = (grossPay * .15);
        System.out.println("Withholdings for this week will be " + withholdings);

        netPay = (grossPay - withholdings);
        System.out.print(withholdings + " will be withheld from your pay this week\n ");
        input.nextLine();

        System.out.println("Nice job keep it up! Goodbye, " + name);
    }
}