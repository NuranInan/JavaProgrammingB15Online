package repl_it;

import java.util.Scanner;

public class Rep_30 {

    public static void main(String[] args) {
        //In this assignment you will write a program to create a shopping list, count and prices.
        //
        //Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!
        //
        //You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.

        //-Declare 4 String variables item1, item2, item3, report.
        String item1, item2, item3, report;
        //-Declare double variables price1, price2, price3, totalPrice
        double price1, price2, price3, totalPrice;
        //-Declare int variables count1, count2, count3
        int count1, count2, count3;
        //-Create a Scanner object named scan.
        Scanner scan = new Scanner(System.in);
        //Execution flow using with example:
        System.out.println("Enter Item1, count and its price:");
        item1=scan.next();
        count1 =scan.nextInt();
        price1 = scan.nextDouble();


        System.out.println("Enter Item2, count and its price: ");
        item2=scan.next();
        count2 =scan.nextInt();
        price2 = scan.nextDouble();


        System.out.println("Enter Item3, count and its price: ");
        item3=scan.next();
        count3 =scan.nextInt();
        price3 = scan.nextDouble();




        totalPrice = (price1*count1)+(price2*count2)+(price3*count3);

        if(count1>0 && count2>0 && count3>0){
            totalPrice = (price1*count1)+(price2*count2)+(price3*count3);
            System.out.println("Item1: "+item1+ "Price: "+ price1+","+"Item2: "+item2+ "Price: "+ price2+"," +"Item3: "+item3+ "Price: "+price3);

        }else if(count1== 0 && count2>0 && count3>0){
            totalPrice =(price2*count2)+(price3*count3);
            System.out.println("Item2: "+item2+ "Price: "+ price2+","+ "Item3: "+item3+ "Price: "+price3);
            System.out.println("Explanation: "+"Item1 "+"\""+item1+"\""+ " is not included since its count is 0");

        }else if(count2==0 && count1>0 && count3>0){
            totalPrice =(price1*count1)+(price3*count3);
            System.out.println("Item1: "+item1+ "Price: "+ price1+","+ "Item3: "+item3+ "Price: "+price3);
            System.out.println("Explanation: "+"Item2 "+"\""+item2+"\""+ " is not included since its count is 0");

        }else if(count3==0 && count2>0 && count1>0){
            totalPrice =(price1*count1)+(price2*count2);
            System.out.println("Item1: "+item1+ "Price: "+ price1+","+ "Item2: "+item2+ "Price: "+price2);
            System.out.println("Explanation: "+"Item3 "+"\""+item3+"\""+ " is not included since its count is 0");
        }

        System.out.println("Total price: "+totalPrice);



    }
}
