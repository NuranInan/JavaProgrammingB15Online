package repl_it;

import java.util.Scanner;

public class Repl_72 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.println(txt.substring(0, (txt.length()-1)));
    }
}
