package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        //break
        //if line contains break reaches, the loop will stop!!


        for (int i = 0; i <=10 ; i++) {

            System.out.println(i);
            break;
        }
        //while iterating over 1 to 10
        //break out of the loop when it's 5





        int sum = 0;
        for (int i = 0; i <=10 ; i++) {

            sum = sum + i;

        }

        System.out.println("sum = " + sum);


        //continue
        //if line contains break reaches the loop will skip to next iteration

        //We can use break and continue for any type of loop


    }
}
