package office_hour.Practice_01_29_2020;

public class Car {

    String brand;
    Engine e;
    String[]passangers;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand ="Toyota";
        c1.e = new Engine("V6", 270);
        c1.passangers= new String[]{"Ziyoda","Aykokul"};
        System.out.println("c1 = " + c1);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e.toString() +
                '}';
    }
}
