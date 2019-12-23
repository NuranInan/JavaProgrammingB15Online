package repl_it;

import java.util.Scanner;

public class Repl_50 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        float mealPrice =10.0f;
        float sodaPrice = 2.0f;
        if(in.equals("burger")||in.equals("chicken")){
            System.out.println(mealPrice);
        }else {
            System.out.println(sodaPrice);
        }
    }
}
