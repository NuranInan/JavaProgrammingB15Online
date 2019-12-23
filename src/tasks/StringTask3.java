package tasks;

import java.util.Scanner;

public class StringTask3 {

    public static void main(String[] args) {
/*Task 3:
*Ask user to enter full name
*assuming full name is 2 word
*write a program to print users initials
*for example:
* Jon Snow-->> Initial id JS
*
*
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  your full name");

        String fullName = scanner.nextLine();

        int lastNameInitialIndex = fullName.indexOf(" ")+1;
        String initial = fullName.charAt(0)+ "" + fullName.charAt(lastNameInitialIndex);


        System.out.println("your initilal is : " + initial);
    }
}
