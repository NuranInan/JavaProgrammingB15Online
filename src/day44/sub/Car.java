package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {

    int milleage;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.milleage = 39637;
        System.out.println("c1.millage = " + c1.milleage);
        c1.setYear(2016);

        System.out.println("c1.getYear = " + c1.getYear());
    }
}
