package repl_it;

import java.util.Scanner;

public class Repl_Or {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String oneBread = "bread";
        if (str.length() == oneBread.length() * 2) {
            System.out.println("nothing");

            //Example:
            //input: breadjambread
            //output: jam
            //
            //Example:
            //input: xxbreadjambreadyy
            //output: jam
            //
            //Example:
            //input: xxbreadapple
            //output: nothing
            //
            //Example:
            //input: breadbutterbread
            //output: butter
            //if(str.indexOf("bread")!=str.lastIndexOf("bread")){
            //       str=str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
            //       System.out.println(str);
            //     }else{
            //       System.out.println("nothing");
            //     }
        }
    }
}




