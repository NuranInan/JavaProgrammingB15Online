package repl_it;

import java.util.Scanner;

public class Repl_46 {

    public static void main(String[] args) {
        //If num is positive, print "__ is positive"
        //If num is negative, print "__ is negative"
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+ " is negative");
        }

    }
}
