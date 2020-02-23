package day56;

public class ListPractice {
    public static void main(String[] args) {


            boolean checkedPrime = false;
            int n = 10;
            if (n <= 1) {
                System.out.println(checkedPrime);
            }

            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println(checkedPrime);
                }
            }
        System.out.println(!checkedPrime);
        }
    }
