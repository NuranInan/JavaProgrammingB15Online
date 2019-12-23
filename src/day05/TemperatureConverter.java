package day05;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature in F ? ");
        double fahrenheit = scan.nextDouble();
        double celcius= ( 5.0/ 9)* (fahrenheit-32);

        //fahrenheit 80 is 23 in celcius
        System.out.println("fahrenheit "+ fahrenheit + "is "+ celcius + " in celcius");





    }
}
