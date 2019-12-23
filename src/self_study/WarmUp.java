package self_study;

public class WarmUp {

    public static void main(String[] args) {

        /*
        *write a program to get unique characters from a string
        * : aaabbccc --> abc
         */

                    //01234567
        String str = "aaabbccc";
        String uniqueStr = "";
        //uniqueStr = str.substring(0,1)+ str.substring(3,4)+str.substring(5,6);

        //System.out.println(uniqueStr);

        for (int i = 0; i < str.length(); i++) {

         String eachChar = str.substring(i , i+1);
         if(!uniqueStr.contains(eachChar)){
             uniqueStr+=eachChar;
                System.out.println(eachChar);
            }

        }
        System.out.println(uniqueStr);

    }
}
