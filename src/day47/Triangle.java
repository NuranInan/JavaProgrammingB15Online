package day47;

public class Triangle {

    int height;
    int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
        int calculateArea= height*base/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
