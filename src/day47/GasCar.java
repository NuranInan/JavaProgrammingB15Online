package day47;

public class GasCar extends Car {

    int gasLevel;

    public  void start(){
        System.out.println("This is how gas car start ");
    }

    public  void goForward(){
        System.out.println("\"GOING FORWARD\" ");
    }

    public  void goBackward(){
        System.out.println("\"GOING BACKWARD\" ");
    }

    public  void turn(String direction){
        System.out.println("TURNING " + direction);
    }
}
