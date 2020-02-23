package day39;
public class SplitPractice {

    public static void main(String[] args) {

        String itemDetails = "iPhone 6s,449,18.71";
        itemDetails = "Dyson Vacuum,399,16.25";
        System.out.println("itemDetails before = " + itemDetails);
        String[] itemSplitArr = itemDetails.split(",");

        String name = itemSplitArr[0];
        System.out.println("name = " + name);

        //System.out.println("name = " + name);
        double price = Double.parseDouble(itemSplitArr[1]);
        System.out.println("price = " + price);

        //System.out.println("price = " + price);
        double monthly = Double.parseDouble(itemSplitArr[2]);
        System.out.println("monthly = " + monthly);
        //System.out.println("monthly = " + monthly);
        itemDetails = name + "," + price * 0.2 + "," + monthly * 0.2;
        System.out.println("itemDetails after = " + itemDetails);


        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price = " + Double.parseDouble(itemDetails.split(",")[1]));
        System.out.println("item monthly = " + Double.parseDouble(itemDetails.split(",")[2]));
//
//        System.out.println("item name = " + itemDetails.split(",")[0]);
//        System.out.println("item price = " + Double.parseDouble(itemDetails.split(",")[1]));
//        System.out.println("item monthly = " + Double.parseDouble(itemDetails.split(",")[2]));

//        System.out.println("item name = " + itemDetails.split(",") [0] );
//        System.out.println("item price = " + itemDetails.split(",") [1] );
//        System.out.println("item monthly = " + itemDetails.split(",") [2] );


    }

}