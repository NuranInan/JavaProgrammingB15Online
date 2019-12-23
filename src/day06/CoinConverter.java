package day06;

public class CoinConverter {

    public static void main(String[] args) {

        //you have 200 cent
        //how many quarter you can get 25c
        //how many dime you can get 10c
        //how many Nickel you can get 5c
        //how many penny you can get
        int cent = 200;

        //you have purchase candle for 0.74 cent
        //what would be your remainder

        cent-= 74;// 126 cent
        int quarter = cent/25;// 126/25-->>5, 1 is remaining
        int penny = cent%25;
        System.out.println(quarter);
        System.out.println(penny);

    }
}
