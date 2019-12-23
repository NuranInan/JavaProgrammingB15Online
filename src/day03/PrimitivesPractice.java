package day03;

public class PrimitivesPractice {
    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println(" The letter count is  " + letterCount);

        short sheepCount = 300;
        System.out.println( "The sheep count is " + sheepCount);

        int catCount = 20;
        System.out.println("The cat count is " +  catCount);

        long mileToMoon = 50000000l;
        System.out.println(" Moon is far from  " + mileToMoon + "from Earth");

        long mileToSun = 10000000L;
        System.out.println(" Sun is far from  " + mileToSun + "from Earth");

        //-------------floating point--------------

        // you must add f at he end of number to indicate this is float data
        // uppercase lowercase does not matter, but it's mandatory

        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;

        //-------------larger floating point numbers-------

        double pricdeOfIpad1 = 355.99d;
        double priceOfipadPro = 1024.99D;
        // compiller automatically assume it's adouble so it;s not requered to have d
        // how aver requmended
        double priceOfMac = 2299.99 ;

        // if you have a whole number by itself. compiler automatically assume it's an int
        // if you have a fractional number by itself compiller automatically assume it's an double




        System.out.println();

    }
}
