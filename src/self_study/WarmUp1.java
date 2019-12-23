package self_study;

import java.util.*;

public class WarmUp1 {

    public static void main(String[] args) {
        String str = "Sunday perfect day to start coding ";
        //reverse above sentence to generate below
       //coding atart to day perfect sunday

        String[] strArr = str.split("");
        for (int i = strArr.length-1; i >= 0; i--) {
            System.out.print(strArr[i]+ "-");
        }

        String strRev = "";
        for (int i = 0; i <strArr.length/2 ; i++) {
         int lastIndex = strArr.length-1;
            String temp = strArr[i];
            strArr[i]=strArr[lastIndex-1];
            strArr[lastIndex-i]=temp;

        }
        System.out.println(Arrays.toString(strArr));
    }
}
