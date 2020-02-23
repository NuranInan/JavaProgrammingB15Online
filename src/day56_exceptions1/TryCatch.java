package day56_exceptions1;

public class TryCatch {

    public static void main(String[] args) {
        System.out.println("BEFORE TRY CATCH");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception happened, and was caught and handled!");

        }

        System.out.println("AFTER TRY CATCH");
        try {
            System.out.println();


            }catch (Exception e){
            System.out.println("Exception happened in Try Block and cought!");
        }
        System.out.println("AFTER TRY CATCH");
        }
    }




