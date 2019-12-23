package day05;

import java.util.Scanner;

public class GrocryActions {
    /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????

    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price of potato ?");
        double potatoPrize= scan.nextDouble();
        System.out.println("how many you want to buy?");
        int potatoCount=scan.nextInt();
        double potatoTotal= (potatoCount * potatoPrize);
        System.out.println("Your total for potato is : "+ potatoTotal);

        System.out.println("What is the prize of tomato ? ");
        double tomatoPrize= scan.nextDouble();
        System.out.println("How many you want to buy ? ");
        int tomatoCount = scan.nextInt();
        double tomatoTotal = tomatoCount * tomatoPrize;
        System.out.println("Your total for tomato is : "+ tomatoTotal);

        System.out.println("What is the prize of banana ?");
        double bananaPrize = scan.nextDouble();
        System.out.println("How many you want to buy ? ");
        int bananaCount =scan.nextInt();
        double bananaTotal =bananaCount * bananaPrize;
        System.out.println("Your total for banana is : " + bananaTotal);

        System.out.println("you got" + potatoCount + "potatos, the prize is : "+ potatoPrize+ "and the total is : "+ potatoTotal);
        System.out.println("you got" + tomatoCount + "tomatos, the prize is : "+ tomatoPrize+ "and the total is : "+ tomatoTotal);
        System.out.println("you got" + bananaCount+ "bananas, the prize is : "+ bananaPrize+ "and the total id : "+ bananaTotal);

        System.out.println("Your grand total for this shoping is $ " +(tomatoTotal+potatoTotal+bananaTotal));
        System.out.println("Thank you for your shoping, hope to see you soon!");
    }
}

