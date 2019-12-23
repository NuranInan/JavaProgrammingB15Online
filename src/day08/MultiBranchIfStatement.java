package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {
       //pseudo code
        /*
         *given your currentSpeed, speedLimit
         *
         * check whether the current speed is
         *
         * more than 90-->> jail
         * more than 80 and less than 90 -->> reckless driving
         * more than 70 and less than 80 -->>point taken
         * more than 70 and less than 80 -->>point taken
         */

        int currentSpeed = 45;


        if(currentSpeed>70){
            System.out.println("you are speeding more than 70-- POINTS TAKEN!!");
        }else if(currentSpeed>60){
            System.out.println("your speed is less than or equal 70 more than 60");
        }else{
            System.out.println("Keep driving you are good!!");
        }





    }
}
