package repl_it;

import java.util.Scanner;

public class ReplOr2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
//<!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
String id=html.substring(html.indexOf("\""),html.lastIndexOf("\""));
        System.out.println(id);
        if(html.contains("<html>")){
            System.out.println(id);
        }else {
            System.out.println("invalid input!");
        }
    }
}
