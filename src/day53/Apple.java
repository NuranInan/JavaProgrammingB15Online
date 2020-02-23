package day53;

public class Apple extends Fruit {

    String type;

    public Apple(String taste, String color, String type) {
        super(taste, color);
        this.type = type;
    }

    @Override
    public void getDigested() {

    }

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
