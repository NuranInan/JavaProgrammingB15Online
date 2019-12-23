package repl_it;

import java.util.Scanner;

public class Repl_110 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (String eachWord: words) {
            String firstlast =""+eachWord.charAt(0)+eachWord.charAt((eachWord.length()-1));
            System.out.println(firstlast);
        }
    }
}
