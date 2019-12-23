package day12;

public class FizzBuzzNumberCheck {
    /* TASK 3 :
    Create a class called FizzBuzzNumberCheck with main method
            Given a number  , create a variable int num
    If this number can be divided by 5 without remainder  lets print  it Fizz number
    For example.  5 , 15 , 25 , 100
    If this number can be divided by 3 without remainder  lets print  it Buzz number
    For example.  3 , 15 , 9 , 27
    If this number can be divided by both 3 and 5  lets print FizzBuzz Number
    For example.   15 , 45 , 30 , 90
    If no match , just say  NOT MY NUMBER !!!!!!! */

    public static void main(String[] args) {
        int num = 100;


        if(num%5==0 && num%3==0){
            System.out.println("Fizz Number and Buzz Number");

        }else if (num%3==0 ){
            System.out.println("Buzz Number!!!!");

        }else if (num%5==0){
            System.out.println("Fizz Number ");

        }else {
            System.out.println("not my number");
        }
    }
}
