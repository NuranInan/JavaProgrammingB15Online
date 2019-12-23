package repl_it;

import java.util.Scanner;

public class Rep_119 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String[]words = email.split("@");
        if(words.length==2){
            System.out.println("Email id: "+ words[0]);
            System.out.println("Email domain: "+ words[1]);
        }else{
            System.out.println("invalid email");
        }



    }
}
