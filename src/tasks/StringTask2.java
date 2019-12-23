package tasks;

import java.util.Scanner;

public class StringTask2 {

    public static void main(String[] args) {
/*
*When searching from google,
* it will always show your search keyword in tab name
* for example if you search Java
* your tab title is : java - Google Search
*
* Create a program to ask user to
* enter a string with any number of word
* Create a variable called searchKeyword + "- Google Search"
*
* Check if tabTitle start with your searchKeyword
* and end with - Google Search
* If so print the test has passed, if not print test has failed
* (Assume you don't know tab title is already correct
* in real world, we will capture it with automation)
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the search Keyword");
        String searchKeyword = scan.nextLine();
        String tabTitle= searchKeyword+ "- Google Search";
        System.out.println("tabTitle = " + tabTitle);

        if(tabTitle.startsWith(searchKeyword)&& tabTitle.endsWith("Google Search")){

            System.out.println("TEST PASSED");

        }else {

            System.out.println("TEST FAILED");
        }






    }
}
