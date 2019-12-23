package repl_it;

import java.util.Scanner;

public class Repl_69 {

    public static void main(String[] args) {
        //Write a program that will print out first half of the word twice.
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int countWord =word.length();
        int halfCount  =countWord/2;

        String halfWord =word.substring(0,halfCount);
        System.out.println(halfWord+halfWord);
    }


        }



