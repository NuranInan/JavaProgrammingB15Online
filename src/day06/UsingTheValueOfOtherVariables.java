package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber =300;
        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My favorite number "+myFavoriteNumber);
        System.out.println("Your favorite number " +yourFavoriteNumber);

        yourFavoriteNumber = 100;

        System.out.println("My favorite number "+myFavoriteNumber);
        System.out.println("Your favorite number " +yourFavoriteNumber);

    /*
    Create a variable called yourOrder, typi String and assign a value



    */
    String yourOrder ="Lahmacun";
    String myOrder ="Lahmacun";

        System.out.println("My favorite number "+myOrder);
        System.out.println("Your favorite number " +yourOrder);

        yourOrder = "Kebab";

        System.out.println("My favorite number "+myOrder);
        System.out.println("Your favorite number " +yourOrder);


    }
}
