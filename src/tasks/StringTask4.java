package tasks;

import java.util.Scanner;

public class StringTask4 {

    public static void main(String[] args) {
/*
*Task 4:
* Ask user to enter a word with at least 3 character
* print the first character
* print the middle character
* for example : Uighur
* first character : U
* last character r
* middle character : g
* (If the length even number get the one on the left)
* for example: Statement
* first character :S
* last character :e
* middle character:t
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word with at least 3 character");
        String name = scanner.next();

        int charCount = name.length();


        System.out.println("first character : " + name.charAt(0));
        System.out.println("last character : " + name.charAt(name.length()-1));

        //012345678            //012345
        //Statement            //Uighur
        //8/2=4                //5/2=2

        int middleIndex = (charCount-1)/2;

        System.out.println("middle character : " + name.charAt(middleIndex));


    }
}
