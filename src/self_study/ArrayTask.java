package self_study;

public class ArrayTask {

    public static void main(String[] args) {


       int [] numbers = new int [] {1,4,6,8,9};

        for (int i = 0; i <numbers.length ; i++) {

            System.out.println("numbers = " + numbers[i]);

            //swap the value

            int sum =0;
            for (int j = 0; j < numbers.length ; j++) {
                sum = sum + numbers[j];
                System.out.println("sum = " + sum);
            }
            

        }



    }
}
