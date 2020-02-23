package day32;

public class StringAction {
    public static void main(String[] args) {
reversePrintMyOwnName();
    }

public static void reversePrintMyOwnName(){
    String name = "Nuran";
    for (int i = name.length()-1; i >=0 ; i--) {
        System.out.print(name.charAt(i));

    }
    System.out.println();
}
}