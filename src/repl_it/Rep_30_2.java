package repl_it;

import java.util.Scanner;

public class Rep_30_2 {



        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            String item1, item2, item3, report="";
            double price1, price2, price3, totalPrice=0.0;
            int count1, count2, count3;

            double groupTotal=0.0;

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter Item1, count and its price:");
            item1=scan.next();// item1 define
            count1=scan.nextInt();
            price1=scan.nextDouble();

            System.out.println("Enter Item3, count and its price:");
            item2=scan.next();
            count2=scan.nextInt();
            price2=scan.nextDouble();

            System.out.println("Enter Item3, count and its price:");
            item3=scan.next();
            count3=scan.nextInt();
            price3=scan.nextDouble();

            if(count1>0){
                groupTotal=count1*price1;
                //report=report+...( message )...
                report +=("Item1: "+item1+" Price: "+groupTotal);
                totalPrice+=groupTotal;
                if(count2>0 || count3>0)
                    report+=", ";

            }
            if(count2>0){
                groupTotal=count2*price2;
                //report=report+...( message )...
                report +=("Item2: "+item2+" Price: "+groupTotal);
                totalPrice+=groupTotal;
                if(count3>0)
                    report+=", ";
            }
            if(count3>0){
                groupTotal=count3*price3;
                //report=report+...( message )...
                report +=("Item3: "+item3+" Price: "+groupTotal);
                totalPrice+=groupTotal;
            }

            System.out.println(report);
            System.out.println("Total price: "+totalPrice);



        }
    }

