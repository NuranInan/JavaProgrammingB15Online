package tasks;

import java.util.Scanner;

public class StringTask5 {

    public static void main(String[] args) {

        /*
        Task 5:
        given a name with prefix, stored in  a String variable called name for example
        for example
        Dr.Dru, Mr. Robot, Ms.Lois, Mrs. Brown
        ---in case insensitive condition---
        print as below
        if the name started with (Dr )-->> Doctor
        if the name started with (Mr )-->> Male
        if the name started with (Miss )-->> Single Female
        if the name started with (Mrs )-->> Married Female

         */
        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter the name with Prefix");
        String name = scanner.nextLine();
        String upperCaseName = name.toUpperCase();

        if(name.startsWith("Dr")){
            System.out.println("Doctor");

        }else if(upperCaseName.startsWith("Mr")){
            System.out.println("Male");

        }else if(upperCaseName.startsWith("Miss")){
            System.out.println("Single Female");

        }else if(upperCaseName.startsWith("Mrs")){
            System.out.println("Married female");
        }else {
            System.out.println("Invalid prefix");
        }




    }
}
