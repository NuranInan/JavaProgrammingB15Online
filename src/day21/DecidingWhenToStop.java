package day21;

public class DecidingWhenToStop {

    public static void main(String[] args) {

        String msg = " Hello world";
        int charCount = msg.length();
        int n=2;

        for (int x = 0; x <= charCount-n ; x++) {
            System.out.println(msg.substring(x,x+n));
        }

    }
}
