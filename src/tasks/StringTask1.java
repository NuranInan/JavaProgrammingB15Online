package tasks;

public class StringTask1 {

    public static void main(String[] args) {
        /*Given a String with any possible length including 0
        *print first 2 characters only if the Sting has more than 1 character
        * if the string is empty print empty string
        * else print the first char twice in same Line
        * For example
        * abcd --> ab
        * "" ----> empty string
        * "J" ---> JJ
         */

        String hava ="y";

        if(hava.isEmpty()){

            System.out.println("Empty String");

        }else if(hava.length()>2){

            System.out.println(hava.substring(0,2));

        }else if (hava.length()==1){

            System.out.println(hava.charAt(0)+""+ hava.charAt(0));
        }




    }
}
