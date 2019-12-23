package self_study;

public class ArrayIntro {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        int i3 = 30;
        int i4 = 40;
        int i5 = 50;

        //we declared int array variable
        //and we assigned and int array object
        //that has capacity of 5

        int []numbers = new int[5];
        //assigning value to array
        numbers[0]=10;
        numbers[1]=15;
        numbers[2]=28;
        numbers[3]=20;
        numbers[4]=3;

        System.out.println(numbers[3]);

        //TASK 2
        //create an array of double


        double [] ary = new double[4];
        ary[0] =1.2;
        ary[1] =1.5;
        ary[2] =1.7;
        ary[3] =1.9;

        System.out.println(ary[0]+ ","+ ary[1]+ ","+ ary[2]+","+ary[3]);


    }
}
