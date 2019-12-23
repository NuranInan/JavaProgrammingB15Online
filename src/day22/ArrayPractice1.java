package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        char []name = new char[5];

        name[0] = 'N';
        name[1] = 'u';
        name[2] = 'r';
        name[3] = 'a';
        name[4] = 'n';

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);

        System.out.println(name);

        boolean [] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0]=true;
        yesNo[1]=false;
        yesNo[2]=10>7;//true

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);
    }
}
