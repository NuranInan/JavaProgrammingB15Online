package repl_it;

import java.util.Scanner;

public class Repl_G {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //YOUR CODE HERE
    int charCount=word.length();
    if (charCount==1){
        System.out.println(word+word+word);
    }else if (charCount==2){
        System.out.println(word+word);
    }else if (charCount>2){
        if (charCount%2==1){
            int indexOfMidCharacter=charCount/2;
            System.out.println(word.charAt (indexOfMidCharacter));
        }else{
            int indexOfFirstHalf=charCount/2-1;
            int indexOfSecondHalf=charCount/2;
            System.out.println(word.charAt(indexOfFirstHalf)+" "+word.charAt(indexOfSecondHalf));
        }
    }
}}
