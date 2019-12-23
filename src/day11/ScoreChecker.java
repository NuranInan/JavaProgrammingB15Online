package day11;

public class ScoreChecker {

    public static void main(String[] args) {
//Create a program to check the score   : ScoreChecker with main method
//   Create a variable called score assign a value of your choice
//	 if the score is less than 0 or more than 100  —>> INVALID SCORE!!!!
//      If the score is  100 —>> PERFECT SOCRE
//      If the score is between 70-100  —>> YOU HAVE PASSED !
//      Else you have failed !!!!!
        int score = 100;


        if(score<0 || score>100){
            System.out.println("INVALID SCORE!!!!!");

        }else if (score== 100){
            System.out.println("PERFECT SCORE!!!!");

        }else if (score>70 && score<100){
            System.out.println("You have Passed!!!!!");

        }else {
            System.out.println("You have failed!!!!!");
        }
    }
}
