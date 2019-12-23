package repl_it;

import java.util.Scanner;

public class Repl_38 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        //if they are equal output  "word1 equals word2"
        //else output "word1 does not equal word2"

        if(word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }
    }
}
